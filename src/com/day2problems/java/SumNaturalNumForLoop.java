package com.day2problems.java;

/**
 * 
 * @author Kapil
 *
 */
public class SumNaturalNumForLoop {
	
	public static void main(String[] args) {
		    int i, num = 5, sum = 0;

		    // executes until the condition return true
	     	for (i = 1; i <= num; i++) {

			// adding the value of i into sum variable
			sum = sum + i;
		}
		System.out.println("sum of first Natural numbers is =" + sum);
	 }

}
