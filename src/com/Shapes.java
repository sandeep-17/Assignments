package com.assignments;

public class Shapes {

	//area of square
		void findArea(float side) {
			System.out.println("area of square:"+side*side);
		}
		//area of ellipse
		void findArea(float PI, float length, float height) {
			System.out.println("area of ellipse:"+PI*length*height);
		}
		//area of circle
		void findArea(float PI, float radius) {
			System.out.println("area of circle:"+PI*radius);
		}
		//area of rectangle
		void findArea(int length, float height) {
			System.out.println("area of rectangle:"+length*height);
		}
}
