package com.masai.Q2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pD")
public class PrintData {
	
	@Autowired
	public List<String> cities;
	
	
	@Autowired
	List<Student> students;
	
	public void printData() {
		
		System.out.println("List of cities:-\n");
		cities.forEach(c -> System.out.println(c));
		
		System.out.println("\n*****************");
		
		System.out.println("\nList of students:-");
		
		students.forEach(s -> {	System.out.println(s);
								System.out.println("---------");});
		
	}
}
