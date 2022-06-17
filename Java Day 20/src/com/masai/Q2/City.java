package com.masai.Q2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class City {
	
	public static void main(String[] args) {
		
		List<String> cities = Arrays.asList("Mumbai","Banglore","Kolkata","Chennai","Lucknow","Pune","Chandigarh");
		
//		Collections.sort(cities, (c1,c2) -> c1.compareTo(c2)); //sort cities in ascending order using Lambda Expression.
		
		Collections.sort(cities, (c1,c2) -> c2.compareTo(c1)); //sort cities in descending order using Lambda Expression.
		
		System.out.println(cities);
		
	}
}
