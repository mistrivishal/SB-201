package com.masai;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Media;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController // it makes by default the the class as rest api raw raw data class i.e.
				// @Controller + @ResponseBody = @RestController
@RequestMapping("/studentapp") //http://localhost:8888/studentapp/students or students (we can access the individual student data by passing roll no. or any unique parameter  
public class MyController {

//	web application:-
//	@RequestMapping("/hello")
//	public String sayHello() {
//		return "Welcome"; // logical name of physical jsp page i.e. "welcome.jsp" page
//	}

//	don't use or not recommended to use the web application method and web server method in one class

//	web services- 
	@RequestMapping("/hello")
//	@ResponseBody
	public String sayHello() {
		return "Welcome"; // it will be represented as raw data
						  //--> http://localhost:8888/hello;
	}

	//return single student:
//	@RequestMapping("/student") //1st way to access
//	@RequestMapping(value = "/student", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) //Second method but GET is default method so we not use it in above annotation for other we have to use this method explicitly (like POST,DELETE,PUT)
																												 //produces use for the in which type/form we want to send the raw data to client and JSON is the default produce value/type, because we don't use it in above method
	@GetMapping("/student")//shortcut given by the Spring we also can f]perform all the above operation in @GetMapping like (method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE);
	public Student getStudentHandler() {
		
		Student student  =  new Student(10, "Ram", 780);
		
		return student; //it will return student obj and converted into json while call it on the browser by url "http://localhost:8888(por value configure in properties file)//student(@RequestMapping("/student"))"
						//--> http://localhost:8888/student;
	}
	
	@GetMapping("/studentr/{roll}/{name}/{marks}")	
	public Student getStudentHandler(@PathVariable("roll") int rollno,@PathVariable("name") String name,@PathVariable("marks") int marks) { //using @PathVariable we can pass single or multiple @PathVariable like ( 
																		 // (@PathVariable("roll") int rollno, @PathVariable("name") String name,@PathVariable("marks") int marks);
		Student student  =  new Student(rollno, name, marks);
		
		return student; //it will return student obj and converted into json while call it on the browser by url "http://localhost:8888(por value configure in properties file)//student(@RequestMapping("/student"))"
						//--> http://localhost:8888/student;
	}
	
	
	//return list of students
	@RequestMapping("/students")
	public List<Student> getStudentsHandler() {
		
		List<Student> students  =  new ArrayList<>();
		 
		students.add(new Student(10, "Ram", 780));
		students.add(new Student(20, "Ramesh", 680));
		students.add(new Student(30, "Ramcharan", 880));
		
		return students; //it will return list of student obj and converted into json
						//--> http://localhost:8888/students;
	}
}
