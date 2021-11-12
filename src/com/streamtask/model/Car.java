package com.streamtask.model;

import java.util.Objects;

public class Car {
	Integer carId;
	String brand;
	String name;
	String variant;
	String colour;
	String engine;
	Long price;
	public Car(Integer carId, String brand, String name, String variant, String colour, String engine,Long price) {
		super();
		this.carId = carId;
		this.brand = brand;
		this.name = name;
		this.variant = variant;
		this.colour = colour;
		this.engine = engine;
		this.price=price;
	}
	public Long getPrice() {
		return price;
	}
	
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setVariant(String variant) {
		this.variant = variant;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	public String getName() {
		return name;
	}
	public String getVariant() {
		return variant;
	}
	public String getColour() {
		return colour;
	}
	public String getEngine() {
		return engine;
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, carId, colour, engine, name, price, variant);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(carId, other.carId)
				&& Objects.equals(colour, other.colour) && Objects.equals(engine, other.engine)
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(variant, other.variant);
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", brand=" + brand + ", name=" + name + ", variant=" + variant + ", colour="
				+ colour + ", engine=" + engine + ", price=" + price + "]";
	}
	
	
	
	
	

}
