package com.masai.Drawshapes;

public class Circle implements Shape{
	
	public void draw() {
		System.out.println("You have drawn Circle.");
	}
	
	@Override
	public void drawShape() {
		draw();
	}
}
