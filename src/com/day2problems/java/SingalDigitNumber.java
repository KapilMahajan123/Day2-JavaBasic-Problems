package com.day2problems.java;

import java.util.Scanner;

/**
 * 
 * @author Kapil
 *
 */
public class SingalDigitNumber {
	public static void main(String[] args) {

		// taking input from user using scanner class
		// sc is an object made of scanner class
		Scanner sc = new Scanner(System.in);
		
		//Printing the massage for entering number
		System.out.println("Enter any single digit number");
		int num = sc.nextInt();
		
		//Zero to Nine statements that will be executed
		//if that statement is true
		if (num == 0) {
			System.out.println("Zero");
		} else if (num == 1) {
			System.out.println("One");
		} else if (num == 2) {
			System.out.println("Two");
		} else if (num == 3) {
			System.out.println("Three");
		} else if (num == 4) {
			System.out.println("Four");
		} else if (num == 5) {
			System.out.println("Five");
		}else if(num == 6) {
			System.out.println("Six");	
	    }else if(num == 7) {
	    	System.out.println("Seven");	
	    }else if(num == 8) {
	    	System.out.println("Eight");	
	    }else if(num == 9) {
	    	System.out.println("Nine");	
	    }else {											//if statement checking the invalid input
	    	System.out.println("Invalid input");
	}
	}

}