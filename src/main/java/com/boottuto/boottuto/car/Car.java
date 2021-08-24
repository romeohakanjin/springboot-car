package com.boottuto.boottuto.car;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Car {
	@Id
	@SequenceGenerator(
		name = "car_sequence",
		sequenceName = "car_sequence",
		allocationSize = 1
	)
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator = "car_sequence"
	)
	private Long id;
	private String manufacturer;
	private int horspower;
	private String color;
	
	public Car() {
	}
	
	public Car(Long id, String manufacturer, int horspower, String color) {
		this.id = id;
		this.manufacturer = manufacturer;
		this.horspower = horspower;
		this.color = color;
	}
	
	public Car(String manufacturer, int horspower, String color) {
		this.manufacturer = manufacturer;
		this.horspower = horspower;
		this.color = color;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(final Long id) {
		this.id = id;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(final String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public int getHorspower() {
		return horspower;
	}
	
	public void setHorspower(final int horspower) {
		this.horspower = horspower;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(final String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", horspower=" + horspower + ", id=" + id + ", manufacturer=" + manufacturer
				+ "]";
	}

	
}
