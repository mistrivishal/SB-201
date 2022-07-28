package com.masai.Drawshapes;

public class Cylinder implements Shape{
	
	public void draw() {
		System.out.println("You have drawn Cylinder.");
	}
	
	@Override
	public void drawShape() {
		draw();
	}
}
