package com.bptn.course._08_polymorphism;

//Parent class
class Animal {
	
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

//Sub class
class Dog extends Animal{
	
//	has its own methods, its a good practice to include @Override annotation because the method already existed in the parent class
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}
	

public class Polymorphism1 {

	public static void main(String[] args) {
		
//			create an object of the Animal class
		Animal a1= new Animal();
		a1.makeSound();
		
//		create an object from Dog class
		Dog d1 = new Dog();
		d1.makeSound();  // this is happening because dog class inherited from the animal class
	}

}
// Notes
// you use Override when the subclass decides to override an existing method in the parent class, this means there must be inheritance
// Name of the method, return type of the method and the number of the parameters in the overriden method should be the same
// By convention, the overridden method has @override annotation above its method signature
// Static methods cannot be overridden
// run-time polymorphism
// You can only have one public class in a file