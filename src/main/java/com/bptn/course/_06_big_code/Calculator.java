package com.bptn.course._06_big_code;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// import scanner
		Scanner scanner = new Scanner(System.in);
		 int operation;
	        double num1, num2, result;

	        do {
	            System.out.println("/...Calculator Menu.../");
	            System.out.println("Press 1 for addition");
	            System.out.println("Press 2 for subtraction");
	            System.out.println("Press 3 for multiplication");
	            System.out.println("Press 4 for division");
	            System.out.println("Press 5 to square a number");
	            System.out.println("Press 6 to find a square root");
	            System.out.println("Press 7 to find the reciprocal");
	            System.out.print("Choose an operation: ");
	            operation = scanner.nextInt();

	            switch (operation) {
	                case 1: // Addition
	                    System.out.println("Enter the first number: ");
	                    num1 = scanner.nextDouble();
	                    System.out.println("Enter the second number: ");
	                    num2 = scanner.nextDouble();
	                    result = num1 + num2;
	                    System.out.println("The sum of the numbers " + num1 + " and " + num2 + " is = " + result);
	                    break;
	                case 2: // Subtraction
	                    System.out.println("Enter the first number: ");
	                    num1 = scanner.nextDouble();
	                    System.out.println("Enter the second number: ");
	                    num2 = scanner.nextDouble();
	                    result = num1 - num2;
	                    System.out.println("The difference of the numbers " + num1 + " and " + num2 + " is = " + result);
	                    break;
	                case 3: // Multiplication
	                    System.out.println("Enter the first number: ");
	                    num1 = scanner.nextDouble();
	                    System.out.println("Enter the second number: ");
	                    num2 = scanner.nextDouble();
	                    result = num1 * num2;
	                    System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + result);
	                    break;
	                case 4: // Division
	                    System.out.println("Enter the first number: ");
	                    num1 = scanner.nextDouble();
	                    System.out.println("Enter the second number: ");
	                    num2 = scanner.nextDouble();
	                    if (num2 != 0) {
	                        result = num1 / num2;
	                        System.out.println("The quotient of the numbers " + num1 + " and " + num2 + " is = " + result);
	                    } else {
	                        System.out.println("Division by zero is not possible.");
	                    }
	                    break;
	                case 5: // Square
	                    System.out.println("Enter a number: ");
	                    num1 = scanner.nextDouble();
	                    result = num1 * num1;
	                    System.out.println("The square of " + num1 + " is = " + result);
	                    break;
	                case 6: // Square root
	                    System.out.println("Enter a number: ");
	                    num1 = scanner.nextDouble();
	                    if (num1 >= 0) {
	                        result = Math.sqrt(num1);
	                        System.out.println("The square root of " + num1 + " is = " + result);
	                    } else {
	                        System.out.println("Cannot find square root of a negative number.");
	                    }
	                    break;
	                case 7: // Reciprocal
	                    System.out.println("Enter a number: ");
	                    num1 = scanner.nextDouble();
	                    if (num1 != 0) {
	                        result = 1 / num1;
	                        System.out.println("The reciprocal of " + num1 + " is = " + result);
	                    } else {
	                        System.out.println("Reciprocal of zero is not defined.");
	                    }
	                    break;
	                default:
	                    System.out.println("Invalid operation selected.");
	            }

	            System.out.print("To continue calculation Press 1, else press any other number to exit: "+ "\n");
	        } while (scanner.nextInt() == 1);

	        scanner.close();
	}

}
