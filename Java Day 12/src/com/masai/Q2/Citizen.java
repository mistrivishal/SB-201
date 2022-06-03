package com.masai.Q2;

import java.util.regex.Pattern;

public class Citizen {
	
	private String name;
	private String aadharNumber;
	private String mobileNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
//		if(name.length()>=3 && name.length()<=8 && Pattern.matches("[a-zA-Z]", name)) {
			this.name = name;
//		}
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
//		if(Pattern.matches("[0-9]", aadharNumber) && aadharNumber.length()==12) {
			this.aadharNumber = aadharNumber;
//		}
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
//		if(Pattern.matches("[6789][0-9]{9}", mobileNumber)){
			this.mobileNumber = mobileNumber;
//		}
	}
	public Citizen(String name, String aadharNumber, String mobileNumber) {
//		if(name.length()>=3 && name.length()<=8 && Pattern.matches("[a-zA-Z]", name)) {
			this.name = name;
//		}
//		if(Pattern.matches("[0-9]", aadharNumber) && aadharNumber.length()==12) {
			this.aadharNumber = aadharNumber;
//		}
//		if(Pattern.matches("[6789][0-9]{9}", mobileNumber)){
			this.mobileNumber = mobileNumber;
//		}
		
	}
	public Citizen() {

	}
	
}
