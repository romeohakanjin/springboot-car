package com.boottuto.boottuto.car;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

	@Bean
	CommandLineRunner commandLineRunner(CarRepository repository) {
        return args -> {
            Car car1 = new Car("bmw", 176, "blue", LocalDate.of(1996, 10, 16));
            Car car2 = new Car("audi", 190, "yellow", LocalDate.of(1993, 3, 20));

            repository.saveAll(List.of(car1, car2));
        };
	}
}
