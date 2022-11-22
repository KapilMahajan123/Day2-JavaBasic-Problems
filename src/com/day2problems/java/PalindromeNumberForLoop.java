package com.day2problems.java;

import java.util.Scanner;

/**
 * 
 * @author Kapil
 *
 */
public class PalindromeNumberForLoop {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number to check Palindrome");
		int n = s.nextInt();
		int rev = 0; //Stores the reversed number
		int rem ; //stores the remainder
		int temp = n;
		System.out.println("Actual Number: "+ n+"");
		for(int i=n ; i > 0; )//no need of decrement here
		{
			rem = i % 10 ;
			rev = rev * 10 + rem;
			i = i / 10;

		}	
		System.out.println("Reversed Number is: "+ rev+"\n");
		if(temp == rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	 }
}
