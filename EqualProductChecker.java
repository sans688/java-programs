package java_prep;

import java.util.Scanner;

/**
 * Write a method hasEqualProduct with 3 parameters of type int.

The method should return boolean and it needs to return true if the product of the
 first and second parameter is equal to the third parameter. Otherwise, return false.  

Example 

Input :

2 3 6

Output :

True  

Explanation:

Since 2*3 is equal to 6, hence return true.*/
public class EqualProductChecker {
	public static boolean hasEqualProduct(int num1, int num2, int num3) {
		
		if((num1 * num2)==num3) {
			
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter any 3 numbers:");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int n3=sc.nextInt();
			System.out.println(hasEqualProduct(n1,n2,n3));
		}
		
	}
	
}
