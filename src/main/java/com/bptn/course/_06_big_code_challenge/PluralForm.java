package com.bptn.course._06_big_code_challenge;

import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Prompt the user for the amount and the word
		        System.out.print("Enter the amount: ");
		        int amt = scanner.nextInt(); // Declear variable to store amount
		        scanner.nextLine();  // Consume the newline to ensure next string input works properly
		        System.out.print("Enter the singular noun: ");
		        String word = scanner.nextLine(); 

		        // Determine the correct plural form of the word
		        String pluralWord = pluralize(amt, word);
		        
		        // Output the quantity followed by the correct form of the noun
		        System.out.println(amt + " " + pluralWord);
		        
		        scanner.close(); // Close the scanner to free up resources
		    }
		    
		    private static String pluralize(int amt, String word) {
		       // Return the singular form if the quantity is 1, otherwise find the plural form
		        if (amt == 1) {
		            return word;
		        } else {
		            return applyPluralRules(word);
		        }
		    }

		    private static String applyPluralRules(String word) {
		        // Handle various endings according to specific rules for pluralization
		        if (word.endsWith("fe")) {
		          // Replace "fe" with "ves" (knife -> knives)
		            return word.substring(0, word.length() - 2) + "ves";
		        } else if (word.endsWith("y")) {
		           // Handle nouns ending in "y" that are not preceded by a vowel
		            if (word.endsWith("ay") || word.endsWith("ey") || word.endsWith("iy") || word.endsWith("oy") || word.endsWith("uy")) {
		               // Simply add "s" if "y" is preceded by a vowel
		                return word + "s";
		            } else {
		               // Replace "y" with "ies" if "y" is not preceded by a vowel
		                return word.substring(0, word.length() - 1) + "ies";
		            }
		        } else if (word.endsWith("us")) {
		          // Replace "us" with "i" (cactus -> cacti)
		            return word.substring(0, word.length() - 2) + "i";
		        } else if (word.endsWith("sh") || word.endsWith("ch")) {
		           // Add "es" to nouns ending in "sh" or "ch" (bush -> bushes)
		            return word + "es";
		        } else if (word.endsWith("s") || word.endsWith("x") || word.endsWith("z")) {
		          // Add "es" to nouns ending in "s", "x", or "z" (bus -> buses)
		            return word + "es";
		        } else {
		          // For all other cases, simply add "s"
		            return word + "s";
		        }


		/*
		Summary:
		The task was to develop a program that correctly pluralizes given nouns based on their ending letters and a specified quantity. This involved applying a series of English language rules for pluralization, which differ based on the suffix of the noun.

		Challenges and Learnings:
		1. **Understanding Pluralization Rules**: The initial challenge was to translate the regular and irregular pluralization rules of English into code logic, especially for nouns with various endings like "fe", "y", "us", etc.
		2. **String Manipulation**: Implementing string manipulations efficiently to check and modify string endings was crucial.
		3. **Edge Cases**: Handling nouns that do not follow simple pluralization rules (like "us" ending words) required careful consideration and specific coding.

		From this experience, I've learned the importance of thorough testing with various inputs to ensure all edge cases are handled. This will be crucial in future coding tasks, especially when working with language processing or any task involving rule-based transformations.
		*/


		    }
		}

