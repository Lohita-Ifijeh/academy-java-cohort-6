package com.bptn.course._03_flow_control._05_if_else_if_statement;

import java.util.Scanner;

public class IfElseIfStatement {

	public static void main(String[] args) {

		// Print prompt requesting users input
		System.out.println("\n \n You are on an island surrounded by water.\n There is a path to the woods to the north, the sea to the south, and a beach shack to the east. \n Which way do you want to go (n,e,s,w)?");
		// Import scanner
		Scanner scan = new Scanner(System.in);
		// Collect user input
		String command = scan.nextLine();
		// Add if else if conditional statement and output for e,s,w and else
		if (command.equals("n")) {
			System.out.println("You enter the forest and hear some rustling. \n There may be tigers here or maybe it's just monkeys.");
		} else if (command.equals("s")) {
			System.out.println("You are now at the sea! ");
		} else if (command.equals("e")) {
			System.out.println("You are now entering the beach shack!");
		} else if (command.equals("w")) {
			System.out.println("You are now headed west!");
		} else {
			System.out.println("End of adventure!");
		}

		scan.close();

	}

}
