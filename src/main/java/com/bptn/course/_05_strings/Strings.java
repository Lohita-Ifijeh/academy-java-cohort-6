package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		
		String s = "Hello world";
		
		int stringlength= s.length();
		
		System.out.println("The total length of the string is " + stringlength);
		
		String sub = s.substring(0, 8);
		
		System.out.println("The string with start index is 0 and the 8 is: " + sub);
		
		String sub1 = s.substring(4);
		
		System.out.println("The sting after index 4 is " + sub1);
		
		String lowerCaseString =s.toLowerCase();
		
		System.out.println("The lowercase string is " + lowerCaseString);
		
		String UpperCase =s.toUpperCase();
		
		System.out.println("The Uppercase is " + UpperCase);
		
		int index= s.indexOf("world");
		
		System.out.println("The index of world is: " + index);
		
		char c = s.charAt(0);
		
		System.out.println("The character at index 0 is: " + c);
		
		
		
	}
}
