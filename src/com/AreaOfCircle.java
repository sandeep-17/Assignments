package com.assignments;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		AreaOfCircle area = new AreaOfCircle();
		area.areaOfCircle(3.14f,15f);

	}
	
	void areaOfCircle(float PI, float radius) {
		System.out.println("Area of circle: "+PI*radius*radius);
	}

}
