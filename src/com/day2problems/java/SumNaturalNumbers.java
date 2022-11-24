package com.day2problems.java;

/**
 * 
 * @author Kapil
 *
 */
public class SumNaturalNumbers {
	
	public static void main(String[] args) {
		int n = 5, i = 1, sum = 0;

		// Executes until the condition return true
		while (i <= n) {
			
			// adding the value of i into sum variable
			sum = sum + i;

			// increments the value of i by 1
			i++;
		}
		// print the sum
		System.out.println("sum of first 5 natural numbers is=" + sum);
	 }


}
