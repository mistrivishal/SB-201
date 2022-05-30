package com.masai.Q4;


public class Main {

	public static Person generatePerson(Person person) {
		if(person instanceof Student) {
			return ((Student)person);
		}else {
			return ((Instructor)person);
		}
	}
}
