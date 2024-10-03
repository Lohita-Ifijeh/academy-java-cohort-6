package com.bptn.course._09_abstraction;

//Abstraction using interface (After Java 8)
//Interfaces can support abstract, default and abstract methods

interface Operations{
	
	void draw();// abstract method has no implementation
	
	//default method- has some implementation
	default int add(int a, int b) {
		return a + b;
	}
//	Static method
	static double getRandomNumber() {
		return Math.random();
	}
	
}
//sub class- create a sub class that implements the Operations interface
class Calculator implements Operations{

	//compiler always enforeces the sub class to implement the methods in the abstract method from the interface
	@Override
	public void draw() {
		System.out.println("Draw method implemented by Calculator class");
		
	}
	
	
	
}
public class Abstraction3 {

	public static void main(String[] args) {
	Calculator c1 = new Calculator();
	
	c1.draw();
	int result = c1.add(5, 7);
	
	System.out.println("The result is: " + result);
	
	System.out.println("The random number is: " + Operations.getRandomNumber());

	}

} 
//Notes
//Interface cannot be instantiated
// Abstract methods in the interface is implemented using a subclass
//Interfaces support multiple inheritance, but abstract can only have one parent class
//Interface cannot have instance variables
// Interface cannot have constructors.
//It can consist of constants.