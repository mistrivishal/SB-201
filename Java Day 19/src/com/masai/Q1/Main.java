package com.masai.Q1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		Map<String,Student> students = new HashMap<>();
		
		students.put("Maharashtra", new Student(45,"Rohit",480));
		students.put("Chennai", new Student(7,"Dhoni",460));
		students.put("Kolkata", new Student(5,"Gautam",440));
		students.put("Rajasthan", new Student(23,"Shane",420));
		students.put("Hydrabad", new Student(18,"Adam",410));
		
		
		Set<Map.Entry<String,Student>> myStudents = students.entrySet();
		
		Set<Map.Entry<String,Student>> myStuTree = new TreeSet<>((s1,s2) -> s1.getValue().getMarks() > s2.getValue().getMarks() ? +1:-1);
		
		for(Map.Entry<String,Student> setStudents: myStudents) {
			myStuTree.add(setStudents);
		}
		
		for(Map.Entry<String,Student> result: myStuTree) {
			System.out.println(result.getKey()+ ": " + result.getValue());
			System.out.println("~~~~~~~~~~~~~~");
		}
	}
}
