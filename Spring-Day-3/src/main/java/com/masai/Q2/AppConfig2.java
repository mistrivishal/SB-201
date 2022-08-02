package com.masai.Q2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai.Q2")
public class AppConfig2 {
	
	
	
	@Bean
	public List<String> cities(){
		
		List<String> str = new ArrayList<>();
		
		str.add("Mumbai");
		str.add("Pune");
		str.add("Nashik");
		str.add("Bengalore");
		str.add("Chennai");
		
		return str;		
	}
	
	
	
	@Bean
	public List<Student> students(){
		
		List<Student> st = new ArrayList<>();
		
		st.add(new Student(10,"Ram",780));
		st.add(new Student(11,"Shyam",740));
		st.add(new Student(12,"Sita",720));
		st.add(new Student(13,"Gita",750));
		st.add(new Student(14,"Tom",710));
		
		return st;
		
	}

}
