package com.bptn.course._11_access_modifiers._01_package_a;

public class ClassA {
	
	// declare a private variable
		private int privateVar;

		// declare a public variable
		public int publicVar;

		// declare a default variable
		int defaultVar;

		// declare a protected variable
		protected int protectedVar;

		// declare a private method
		private void privateMethod() {
			System.out.println("This is a private Method");
		}

		// declare a public method
		public void publicMethod() {
			System.out.println("This is a public Method");
		}
		
		//declare a default method
		void defaultMethod() {
			System.out.println("This is a default method");
		}
		
		//declare a protected method
		protected void protectedMethod() {
			System.out.println("This is a protected Method");
		}
		
		public static void main(String[] args) {
			// create an object of ClassA
			ClassA myObj = new ClassA();
			
			//Yes we can access the private method within the same class
			myObj.privateMethod();


	}

}
