package com.boottuto.boottuto.car;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

	@Query("SELECT c FROM Car c WHERE c.manufacturer = ?1")
	Optional<Car> findCarByManufacturer(final String manufacturer);
}
