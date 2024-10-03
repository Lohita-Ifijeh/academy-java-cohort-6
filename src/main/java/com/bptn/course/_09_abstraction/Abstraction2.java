package com.bptn.course._09_abstraction;

//Abstraction using interface - Before Java 8

interface ShapeInterface{
	
//	Before Java 8 - interface had only abstract methods and constants
//	lets create some abstract methods
	
	void draw();
	double getArea();
}
//to implement the abstract method from the interface- we need to create a subclass
class RectangleClass implements ShapeInterface{
	
	private double width;
	private double height;
	

	@Override
	public void draw() {
		System.out.println("Draw a rectangle");
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

public class Abstraction2 {

	public static void main(String[] args) {
		

	}

}
