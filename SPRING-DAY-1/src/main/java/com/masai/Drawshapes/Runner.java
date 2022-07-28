package com.masai.Drawshapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext apx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DrawShapes ds = apx.getBean(DrawShapes.class,"ds");
		
		ds.draw();
		
	}
	
}
