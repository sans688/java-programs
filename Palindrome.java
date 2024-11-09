package com_edu;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num= sc.nextInt();
		int original = num;
		
		int reversed =reverse(num);
		palindromeOrNot(original, reversed);
	}
	public static int reverse(int num) {
		int reverse=0;
		while(num>0) {
			int temp=num%10;
			reverse= reverse*10+temp;
			num=num/10;
		}
		return reverse;
	}
	public static void palindromeOrNot(int original,int reversed) {
		if(original == reversed) {
				System.out.println("Number is palindrome");
			}
		else{
			System.out.println("Number is not palindrome");
		}
		
			
		
	}

}
