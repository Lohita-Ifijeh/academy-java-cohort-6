package com.bptn.course._07_oop;

public class Employee {

//	Instance Variable 
//	name, emploeeId and age

	private String name;
	private int employeeId;
	private int age;

//	CONSTRUCTORS
//	Default constructor
	public Employee() {

		this.name = "Lohita";
		this.employeeId = 100;
		this.age = 20;
	}

//		parameterized constructor - with 2 parameters
	public Employee(String name, int employeeId) {

		this.name = name;
		this.employeeId = employeeId;

	}

//		parameterized constructor - with 3 parameters
	public Employee(String name, int employeeId, int age) {

		this(name, employeeId); // This is invoking the constructor with 2 parameters instead of writing it out again.
		this.age = age;

	}

//methods
	public void printInfo() {
		System.out.println("Employee name: " + this.name + " EmployeeId: " + this.employeeId + " age: " + this.age);
	}

	public static void main(String[] args) {
		// create objects from this class
		Employee e1 = new Employee();
		e1.printInfo();

		Employee e2 = new Employee("John Doe", 1234);
		e2.printInfo();

		Employee e3 = new Employee("Jame Smith", 5678, 30);
		e3.printInfo();

	}

}
