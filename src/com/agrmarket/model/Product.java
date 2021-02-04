package com.agrmarket.model;

public class Product {
	
	private int code;
	private String description;
	private String brand;
	private String presentation;
	private int price;
	private int location;
	
	public Product() {
		
	}

	public Product(int code, String description, String brand, String presentation, int price, int location) {
		super();
		this.code = code;
		this.description = description;
		this.brand = brand;
		this.presentation = presentation;
		this.price = price;
		this.location = location;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPresentation() {
		return presentation;
	}

	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", brand=" + brand + ", presentation="
				+ presentation + ", price=" + price + ", location=" + location + "]";
	}
	
	

}
