package com.masai.Q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	@Bean
	public Map<Student, String> theMap(){
		
		Map<Student, String> theMap = new HashMap<>();
		
		for(int i=0;i<5;i++) {
			theMap.put(students().get(i), cities().get(i));
		}
		
		return theMap;
		
	}
	
}
