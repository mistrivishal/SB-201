package com.masai.Q2;

import java.io.Serializable;

public class Address implements Serializable{

	private String state;
	private String city;
	private String pincode;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Address(String state, String city, String pincode) {
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	public Address() {
		super();
	}
	@Override
	public String toString() {
		return " State: " + state + ", City: " + city + ", Pincode: " + pincode;
	}
	
	
	
}
