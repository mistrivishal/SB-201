package com.masaiEvaluation;

import java.util.Scanner;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	
	public void displayCourseDetails(int cid,String cname,int cfee) {
		if(cid != 0 || cname != null || cfee != 0) {
			System.out.println("Course ID: " + cid);
			System.out.println("COurse Name: " + cname);
			System.out.println("COurse Fee: " + cfee);
		}else {
			System.out.println("Enter valid course details");
		}
	}
	public static void authenticate(String username,String passWord){
		if(username.equals("Admin") && passWord.equals("1234")) {
			Scanner scan = new Scanner(System.in);
			Course course = new Course();
			System.out.println("Enter the Course ID: ");
			course.courseId = scan.nextInt();
			System.out.println("Enter Course Name: ");
			course.courseName = scan.next();
			System.out.println("Enter Course Fee: ");
			course.courseFee = scan.nextInt();
			
			course.displayCourseDetails(course.courseId,course.courseName,course.courseFee);
		}else {
			System.out.println("Invalid Username or Password..");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Using Invalid Password..");
		Course.authenticate("Admin", "2134");
		
		System.out.println("\n");
		
		System.out.println("Using valid Password..");
		Course.authenticate("Admin", "1234");
	}
}
