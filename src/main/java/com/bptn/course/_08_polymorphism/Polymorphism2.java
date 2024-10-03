package com.bptn.course._08_polymorphism;

// Parent class

class Shape{
	void drawAngle() {
		System.out.println("Drawing a shape angle");
		
	}
}

// Sub class
class Rectangle extends Shape{
@Override
	void drawAngle() {
		System.out.println("Drawing a rectangle");
		
	}
}
public class Polymorphism2 {

	public static void main(String[] args) {
		// 
 Rectangle r1 = new Rectangle();
 r1.drawAngle();
	}

}
// Create a parent class called shape and create only one sub class called Rectangle
// Create a method called drawAngle()in the shape class and override it in the restangle