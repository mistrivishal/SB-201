package com.masai.Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<Student> myStudent = new ArrayList<>();
		
		myStudent.add(new Student(007,"James Bond",777));
		myStudent.add(new Student(050,"Ragu Bhai",850));
		myStudent.add(new Student(001,"Rocky Bhai",901));
		myStudent.add(new Student(101,"Thanos",677));
		myStudent.add(new Student(3000,"Tony Stark",3000));
		
		
		List<Student> newStudent = myStudent.stream()
											.filter(student -> student.getMarks() < 800)
											.collect(Collectors.toList());
		
		System.out.println(newStudent);
		
		
	}
}
