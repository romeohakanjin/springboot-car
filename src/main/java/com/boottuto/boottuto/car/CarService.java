package com.boottuto.boottuto.car;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CarService {

	public List<Car> getCars() {
		return List.of(new Car(1L, "BMW", 190, "blue"));
	}
}
