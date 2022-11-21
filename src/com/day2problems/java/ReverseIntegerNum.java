package com.day2problems.java;

/**
 * 
 * @author Kapil
 *
 */
public class ReverseIntegerNum {
	
	static int reverseDigits(int num) {
		int rev_num = 0;     //Initialize
		while (num > 0) {
			
			//Multiply int by 10 and add remainder of num divided by 10 to int
			rev_num = rev_num * 10 + num % 10;
			num = num / 10;    //Divided num by 10
		}
		//Return 
		return rev_num;
	}
	public static void main(String[] args) {
		{
			int num = 231;
			System.out.println("Reverse of number is " + reverseDigits(num));
		}
	}

}
