package com.bptn.course._07_oop;

public class Phone {
	
//	declare instance variable - properties/attributes
//	weight, height, width, colour
	private int height;
	private int weight;
	private int width;
	private String color;
	
//	Constructors- helps to declare and create objects
//	Has the same name as the class
//	Does not have any return type
//	Default constructor - does not have any parameters passed
	public Phone() {
		
//		default values
		weight = 150;
		height = 140;
		width = 70;
		color = "Black";
	
	}

//	1st Parameterized constructor- which has 4 parameters passed
	

	public Phone(int w, int h, int wi, String c) {
		weight = w;
		height = h;
		width = wi;
		color = c;
				
	}
	
//	1st Parameterized constructor- which has 3 parameters passed

	public Phone(int w, int h, int wi) {
//		Local variables:
		weight = w;
		height = h;
		width = wi;
	}
	
//	declare instance methods, its called instance because we dont have "static" there, they are called using objects -functionality/ behavior
	
	public void makePhoneCall(){
		System.out.println("Make a phone call");
		
		}
	public void sendTextMessage(){
		
		System.out.println("Send a text message");
	}
	
	
	public static void main(String[] args) {

//		Create an object of the Phone class using default constructor
		Phone myObj1 = new Phone();
		
		System.out.println("Default Phone: " + "weight:" + myObj1.weight +" width " + myObj1.width + " color: " + myObj1.color + " height:" + myObj1.height);
		
		Phone myObj2 = new Phone(200, 100, 50,"Red");
		
		System.out.println("Custom Phone: " + "weight: " + myObj2.weight +" width " + myObj2.width + " color: " + myObj2.color + " height: " + myObj2.height);
		              
		Phone myObj3 = new Phone(250, 150, 60);
		System.out.println("Custom Phone without colour: " + " weight: " + myObj3.weight +" width " + myObj3.width + " height: " + myObj3.height +" Color");
	
		myObj1.makePhoneCall();
		myObj1.sendTextMessage();
	
	}

}
//instance variables are always declared as private because we do not want another class to access them

// Instance methods are also declared as public because we want it to be accessible.
// we can have many parameterized constructor which can have the same name but different number of parameters
//we can only have 1 default constructor within class
//if we do not have any constructor in the class - Java automatically created a default constructor by setting default



