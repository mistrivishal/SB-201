package com.masai.Drawshapes;

public class DrawShapes {
	
	Shape s;

	public void setS(Shape s) {
		this.s = s;
	}
	
	public void draw() {
		s.drawShape();
	}
	
}
