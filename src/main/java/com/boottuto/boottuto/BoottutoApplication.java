package com.boottuto.boottuto;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.print.DocFlavor.STRING;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BoottutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoottutoApplication.class, args);
	}

	@GetMapping
	public List<String> hi() {
		return List.of("Hi", "ponita");
	}

}