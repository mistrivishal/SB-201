package com.masai.Drawshapes;

public class Triangle implements Shape{
	
	public void draw() {
		System.out.println("You have drawn Triangle.");
	}

	@Override
	public void drawShape() {
		draw();
	}
}
