package com.masai.Q4;

public class Student extends Person{
	
	int studentId;
	String courseEnrolled;
	int courseFee;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCourseEnrolled() {
		return courseEnrolled;
	}
	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	
	@Override
	public String toString() {
		return "\nStudent Id: " + studentId + "\nStudent Name: " + name + "\nStudent Gender: " + gender +
				"\nCourse Enroll ID: " + courseEnrolled + "\nCousre Fee: " + courseFee +		
				"\nStudent Address: \n" + "City: " + add.city + "\nState: " + add.state + "\nPin Code: " + add.pinCode; 
	}
}