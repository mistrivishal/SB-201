package com.masai.Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		
		List<Student> std = new ArrayList<>();
		
		std.add(new Student(10,"Lala",690));
		std.add(new Student(18,"Ram",990));
		std.add(new Student(12,"Laxman",790));
		std.add(new Student(30,"Sita",880));
		std.add(new Student(07,"Gita",590));
		
		List<Employee> emp = std.stream()
							.map(e -> new Employee(e.getRoll(),e.getName(),(e.getMarks()*1000)))
							.collect(Collectors.toList());
		
		System.out.println(emp);
		
	}
}
