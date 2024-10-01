package com.bptn.course._06_big_code_challenge;

import java.util.Scanner;

class StringOperations {
    public static void main(String[] args) {
      // Import scanner
         Scanner scanner = new Scanner(System.in);
        //  Declare variable
int choice;
        // I used the do loop because the statements need to be executed at least once before we use while to check if its true
        do {
            System.out.println("\n/…String Menu…/");
            System.out.println("Press 1 for Palindrome Check");
            System.out.println("Press 2 to Reverse a String");
            System.out.println("Press 3 to Concatenate Two Strings");
            System.out.println("Press 4 for String Comparison");
            System.out.println("Press 5 to Calculate the Length of String");
            System.out.println("Press 0 to Exit");
            System.out.print("Enter the option: ");

            // Prompted the user to enter their choice
            choice = scanner.nextInt();

            scanner.nextLine(); // consume the remaining newline

            // Used switch statement to validate the users entry and then if it matches run the content of the relevant switch case
            switch (choice) {
                // it check the string comparison
                case 1:
                    System.out.println("Enter a string: ");
                    String str = scanner.nextLine();
                    String reversed ="";

                    for(int i = str.length()-1; i >= 0; i--){
                       reversed= reversed + str.charAt(i);
                    }
                    if (str.equals(reversed)) {
                        System.out.println( str+ " is a palindrome.");
                    } else {
                        System.out.println(str + " is not a palindrome.");
                    }
                    break;
                // reverse the string
                case 2:
                    System.out.print("Enter a string to reverse: ");
                    String reverseString = scanner.nextLine();
                    System.out.println("Reversed string: " + new StringBuilder(reverseString).reverse());
                    break;
                // To concatenate strings
                case 3:
                    System.out.print("Enter the first string: ");
                    String firstString = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    String secondString = scanner.nextLine();
                    System.out.println("Concatenated string: " + firstString + secondString);
                    break;
                // Compare Strings
                case 4:
                    System.out.print("Enter the first string: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    String str2 = scanner.nextLine();
                    if (str1.equals(str2)) {
                        System.out.println("The entered strings are equal.");
                    } else {
                        System.out.println("The entered strings are not equal.");
                    }
                    break;
                // Check the length of the string
                case 5:
                    System.out.print("Enter a string: ");
                    String lengthString = scanner.nextLine();
                    System.out.println("The length of the entered string is: " + lengthString.length());
                    break;
                // End the program
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                // in case the user enters a anything outside the defined parameters
                default:
                    System.out.println("Invalid choice! Please make a valid choice.");
                    break;
            }
            // Now set the condition for the while which is true restarts the loop
        } while (choice != 0);

        scanner.close();
    }

    
            }
    
/*
Summary of String Operations Menu Program:

What was new:
- Implementing a menu-driven program using a do-while loop that allows the user to repeatedly perform various string operations was a practical application of loop control and user input handling in Java.
- Utilizing the switch-case statement to handle multiple user choices effectively, providing a clear structure for extending the program with additional functionality.

Challenges encountered:
- Handling string manipulations such as reversing a string and checking for palindromes required understanding of Java string operations and efficiency considerations.
- Ensuring that the program gracefully handles user inputs, especially ensuring that numerical inputs are correctly managed without causing input mismatch exceptions, which was addressed by consuming the newline character after each integer input.
- Balancing between direct string manipulation and using built-in methods like StringBuilder for reversing strings highlighted the importance of choosing the right tool for a task to optimize performance and code readability.

Key takeaways:
- Always consume the newline character after reading an integer from the console when the next input to read is a string. This prevents skipping the next input due to the leftover newline character.
- When constructing a user interface in the console, clear instructions and user feedback are essential for making the program user-friendly.
- Efficiency in string manipulation: Using StringBuilder to concatenate or reverse strings is more efficient than using immutable strings, which I applied in the palindrome checking and string reversing tasks.
- Error handling in user input: I will ensure to handle potential user input errors more robustly in future projects, possibly incorporating try-catch blocks where necessary.

This task was an excellent exercise in applying Java's control structures and string manipulation methods in a real-world type application, providing a solid foundation for building more complex user-interactive programs.
*/