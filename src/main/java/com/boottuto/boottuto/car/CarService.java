package com.boottuto.boottuto.car;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

	private final CarRepository carRepository;

	@Autowired
	public CarService(final CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	public List<Car> getCars() {
		return carRepository.findAll();
	}

	public void addNewCar(final Car car) {
		final Optional<Car> carByManufacturer = carRepository.findCarByManufacturer(car.getManufacturer());
		if (carByManufacturer.isPresent()) {
			throw new IllegalStateException("The manufactuerer " + car.getManufacturer() +" already exist.");
		}

		carRepository.save(car);
	}

	public void deleteCarByID(final Long id) {
		if (carRepository.existsById(id)){
			carRepository.deleteById(id);
		} else {
			throw new IllegalStateException("car with id "+ id +" does not exists.");
		}
	}

	@Transactional
	public void updateCarManufacturerAndColorByID(final Long id, final String manufacturer, final String color) {
		final Car car = carRepository.findById(id).orElseThrow(() -> new IllegalStateException(
				"No car manufacturer "+ manufacturer +" with "+ color +" color found."));

		if (manufacturer != null && manufacturer.length() > 0 && 
				!Objects.equals(car.getManufacturer(), manufacturer)) {
					car.setManufacturer(manufacturer);
		}
		if (color != null && color.length() > 0 && 
				!Objects.equals(car.getColor(), color)) {
					car.setColor(color);
		}
	}
}
