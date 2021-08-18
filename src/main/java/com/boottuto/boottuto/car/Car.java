package com.boottuto.boottuto.car;

public class Car {
	private int id;
	private String manufacturer;
	private int horspower;
	private String color;
	
	public Car() {
	}
	
	public Car(final int id, final String manufacturer, final int horspower, final String color) {
		this.id = id;
		this.manufacturer = manufacturer;
		this.horspower = horspower;
		this.color = color;
	}
	
	public Car(final String manufacturer, final int horspower, final String color) {
		this.manufacturer = manufacturer;
		this.horspower = horspower;
		this.color = color;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(final int id) {
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
}
