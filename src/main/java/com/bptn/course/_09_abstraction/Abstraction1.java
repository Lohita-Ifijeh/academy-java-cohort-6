package com.bptn.course._09_abstraction;

//Abstraction using abstract class
// Abstract class- it is a class that cannot be instantiated - it cannot be used to create objects

abstract class Shape{
	
//Abstract method- a method which has no implementation
	abstract void draw();
	
	abstract void print();
	
//	normal method
	void moveTo(int x, int y) {
		System.out.println("Move to: " + x + y);
	}
	
}

//Sub class (child class) extends Shape class

class Circle extends Shape{
	
@Override
void draw() {
	System.out.println("Draw a circle");
	
}
@Override
void print() {
	System.out.println("Print a circle");


}
}

public class Abstraction1 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.print();
		c1.draw();
		
		c1.moveTo(2,3); // this is an inherited method from shape class
		 

	}
	
}



//The sub class is going to implement the abstract methods from the abstract class
// When a sub class implements the abstract methods from the abstract class it should follow the rules of overriding