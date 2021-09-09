package com.boottuto.boottuto.car;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

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
	@Transient
	private int timeOnRoad;
	private LocalDate year;
	
	public Car() {
	}
	
	public Car(final Long id, final String manufacturer, final int horspower, final String color, final LocalDate year) {
		this.id = id;
		this.manufacturer = manufacturer;
		this.horspower = horspower;
		this.color = color;
		this.year = year;
	}
	
	public Car(final String manufacturer, final int horspower, final String color, final LocalDate year) {
		this.manufacturer = manufacturer;
		this.horspower = horspower;
		this.color = color;
		this.year = year;
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

	public LocalDate getYear() {
		return year;
	}

	public void setYear(final LocalDate year) {
		this.year = year;
	}

	public int getTimeOnRoad() {
		return Period.between(year, LocalDate.now()).getYears();
	}

	public void setTimeOnRoad(final int timeOnRoad) {
		this.timeOnRoad = timeOnRoad;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", horspower=" + horspower + ", id=" + id + ", manufacturer=" + manufacturer
				+ ", timeOnRoad=" + timeOnRoad + ", year=" + year + "]";
	}

	
}
