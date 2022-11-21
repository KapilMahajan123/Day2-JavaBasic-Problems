package com.day2problems.java;

import java.util.Scanner;

/**
 * 
 * @author Kapil
 *
 */
public class DisplayUnit {
	
	public static void main(String[] args) {
		
		//printing the numbers
		System.out.println("Enter the number:1, 10, 100, 1000 :");
		
		//created an object Scanner
		Scanner sc = new Scanner(System.in);  
		int num = sc.nextInt(); 

	    //if checking the digit true and false
		if (num == 1) {
			System.out.println("Ones place digit");
		} else if (num == 10) {
			System.out.println("Tens place digit");
		} else if (num == 100) {
			System.out.println("Hundred place digit");
		} else if (num == 1000) {
			System.out.println("Thousand place digit");
		} else {
			System.out.println("Wrong Input....");
		}

	}
}


