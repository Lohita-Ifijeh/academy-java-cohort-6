package com.bptn.course._08_polymorphism;

public class Polymorphism3 {
	
	void print(int integer) {
		
		System.out.println("Printing an integer: " + integer);
	}
	
	void print(String s) {
		System.out.println("Printing a string: " + s);
	}

	int print(int a, int b) {
		return a+b;}
	
		
	double print(double a, double b) {
			return a+b;
	}
	
	
	public static void main(String[] args) {
		
		Polymorphism3 p1 = new Polymorphism3();
		p1.print(5);
		
		p1.print("Hello World");
		
		System.out.println("The sum of the two integers: " + p1.print(2, 23));
		
		System.out.println("The sum of the two doubles: " + p1.print(2.3, 2.6));
		
	}

}
//Called method overloading  or compile time polymorphism
// Occurs within the same class and no override is required
// There is no need for inheritance
// Method names should be the same
// it can have different return type and number of parameters can be different
// it can also have different type of parameters
// Static methods can be overloaded
// The system chooses the method that matches with the parameters during the compilation time