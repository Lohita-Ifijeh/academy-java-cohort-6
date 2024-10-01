package com.bptn.course._06_big_code_challenge;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// Set the target number to 23
        int targetNumber = 23;
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        int guess = 0; // Initialize the guess variable

        // Start the guessing loop
        while (true) {
            System.out.print("Enter your guess (between 1 and 100): ");
            guess = scanner.nextInt(); // Read user input

            // Validate the guess is within the range of 1 to 100
            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (guess < targetNumber) { // Guess is too low
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) { // Guess is too high
                System.out.println("Too high! Try again.");
            } else { // Correct guess
                System.out.println("Congratulations! You guessed the number correctly!");
                break; // Exit the loop
            }
        }

        // Close the scanner resource
        scanner.close();
    }

/*
Summary:

The "Number Guessing Game" program is designed to challenge the user to guess a predetermined number within a specific range. The essence of this program lies in its use of conditional statements to check the user's input against the target number and provide feedback accordingly.

Challenges and Learnings:
1. **Input Validation**: Ensuring that the user's input falls within the desired range (1-100). This required implementing a check within the loop to continuously validate input before making a comparison with the target number. It highlighted the importance of validating user input to prevent errors or unexpected behavior in the program.

2. **Loop Control**: The use of an infinite loop (`while (true)`) necessitated a clear and correct implementation of a break condition to exit the loop. This was crucial in managing the flow of the program and ensuring that the game ends appropriately when the user guesses the correct number.

3. **User Interaction**: Designing the game involved thinking carefully about how to interact with the user through prompts and feedback, enhancing the user experience by making it engaging and informative.

Key Takeaways:
- The importance of clear user instructions and feedback cannot be understated. It's essential for creating an interactive application that communicates effectively with its users.
- Proper input validation is crucial for maintaining the integrity and reliability of user interactions. It ensures the program behaves as expected and handles out-of-bound values gracefully.
- The utility of `break` in managing loop execution based on conditions was reinforced. It’s a powerful tool for controlling program flow that I will continue to utilize thoughtfully in future projects.

From this task, I've learned to better structure interactive programs and handle user input more robustly. Ensuring smooth user experience and program reliability will be a focus in my future coding endeavors.
*/
	}


