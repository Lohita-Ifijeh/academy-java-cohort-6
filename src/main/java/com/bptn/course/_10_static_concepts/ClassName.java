package com.bptn.course._10_static_concepts;

public class ClassName {
	
	
	// declare a static Variable
	static int staticVariable = 100;
	
	
	//declare an  instance Variable
	int instanceVariable;
	
	
	//declare a static method
	static void staticMethod() {
		
		System.out.println("Static Method is called..");  
		
		// can I access an instance variable? No
		//instanceVariable = 100; No
		
		//can I access an instance method? No
		//instanceMethod();
	}
	

	
	
	
// declare instance method
	void instanceMethod() {
		System.out.println("Instance method is called..");
		
		// can I access an static variable within an instance method? Yes
		System.out.println("Static variable: " + staticVariable);
		
		// can I access an static method within an instance method? Yes
		staticMethod();
		
		this.staticVariable = 200;
	}
	public static void main(String[] args) {
		ClassName c1 = new ClassName();
		c1.instanceMethod();

		//Access the static variable
		System.out.println("Static variable: " + staticVariable);
		
		staticMethod();
		
		
	}

}
// you cannot access instance variable or method within a static method
// We can access static variable and static method within an instance method
// We can access static variable and static method within the main method