package com.masaiEvaluation;

public class Car {
	private String model;
	private String companyName;
	private String color;
	private Boolean engine;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean getEngine() {
		return engine;
	}
	public void setEngine(Boolean engine) {
		this.engine = engine;
	}
	public Car(String model, String companyName, String color, Boolean engine) {
		this.model = model;
		this.companyName = companyName;
		this.color = color;
		this.engine = engine;
	}	
	public Car() {
		
	}
	public void carDetails(int rpm,int power,String manufacturer,Boolean hasTurbo) {
		System.out.println("Car Model : " + this.model);
		System.err.println("Car companyName : " + this.companyName);
		System.out.println("Car color : " + this.color);
		
		Engine eng = new Engine(rpm, power, manufacturer,hasTurbo);
		eng.hasTurbo = this.engine;
		if(eng.hasTurbo) {
			eng.engDetails();
		}
	}
	
}
class Engine{
	int rmp;
	int power;
	String manufacturer;
	Boolean hasTurbo;
	
	public int getRmp() {
		return rmp;
	}
	public void setRmp(int rmp) {
		this.rmp = rmp;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Boolean getHasTurbo() {
		return hasTurbo;
	}
	public void setHasTurbo(Boolean hasTurbo) {
		this.hasTurbo = hasTurbo;
	}
	public Engine(int rmp, int power, String manufacturer, Boolean hasTurbo) {
		this.rmp = rmp;
		this.power = power;
		this.manufacturer = manufacturer;
		this.hasTurbo = hasTurbo;
	}
	public Engine() {
		
	}
	public void engDetails() {
		System.out.println("Car RPM : " + this.rmp);
		System.out.println("Car power : " + this.power);
		System.out.println("Car Engine Manufacture : " + this.manufacturer);
		System.out.println("Car Has Turbo : " + this.hasTurbo);
	}
}

