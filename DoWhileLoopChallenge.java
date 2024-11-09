package java_prep;

import java.util.Scanner;

/*Declare a variable n and store a number in it. Declare two more variables rem and sum.
 *  Your task is to calculate the sum of the digits of the number, rem will be used for storing 
 *  the digits, and sum will be used to store the sum of those digits.
For example
N = 12345
Sum of digits will be = 15*/
public class DoWhileLoopChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		sumOfDigit(n);
		
	}
	public static void sumOfDigit(int num) {
		int sum=0, temp, rem;
		temp=num;
		do
		{
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
			
		}while(num>0);
		System.out.println("sum of digits of "+temp+" is "+sum);
	}

}
