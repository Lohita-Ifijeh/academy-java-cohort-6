package com.bptn.course._06_big_code_challenge;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
		// Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a word to encrypt
        System.out.print("Enter a word to encrypt: ");
        String word = scanner.nextLine(); // Read the input word
        
        // Initialize an empty StringBuilder to hold the encrypted word
        StringBuilder encryptedWord = new StringBuilder();
        
        // Iterate through each character of the input word
        for (char ch : word.toCharArray()) {
            // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // Shift the character by one position, wrapping from 'z' to 'a'
                if (ch == 'z') {
                    encryptedWord.append('a'); // Wrap around to 'a'
                } else {
                    encryptedWord.append((char) (ch + 1)); // Shift to the next letter
                }
            // Check if the character is an uppercase letter
            } else if (ch >= 'A' && ch <= 'Z') {
                // Shift the character by one position, wrapping from 'Z' to 'A'
                if (ch == 'Z') {
                    encryptedWord.append('A'); // Wrap around to 'A'
                } else {
                    encryptedWord.append((char) (ch + 1)); // Shift to the next letter
                }
            } else {
                // Non-alphabetic characters remain unchanged
                encryptedWord.append(ch);
            }
        }

        // Print the encrypted word
        System.out.println("Encrypted word: " + encryptedWord.toString());
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }

/*
Summary:
The WordEncryption program encrypts a user-inputted word by shifting each alphabetic character to its subsequent character in the alphabet, with wrapping from 'z' to 'a' and 'Z' to 'A'. Non-alphabetic characters are left unchanged.

Challenges and Learnings:
1. **Character Wrapping**: One of the initial challenges was handling the wrapping of characters. Specifically, ensuring that 'z' wraps around to 'a' and 'Z' to 'A' required a conditional check within the alphabetic ranges.
2. **Efficiency with StringBuilder**: Using StringBuilder to construct the encrypted string is a more efficient method than using string concatenation in a loop, as it avoids the creation of multiple intermediate string objects.

From this task, several key takeaways include:
- **Understanding Character Manipulation**: I've become more comfortable with manipulating characters in strings, especially understanding how character arithmetic works in Java, such as using `(char) (ch + 1)` to shift characters.
- **Edge Case Consideration**: It's crucial to think about and handle edge cases in data processing, such as the wrapping of 'z' and 'Z'. This is a valuable approach in any programming task that involves data transformation.
- **Resource Management**: The practice of closing resources, like the Scanner object, after their usage is a good habit that prevents resource leaks and should be consistently applied in future projects.

These lessons are not only applicable to this encryption program but also to broader software development practices where data manipulation and resource management are key components.
*/

	}


