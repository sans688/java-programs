package java_prep;

import java.util.Scanner;

/*Create a function isPalindrome with one int parameter number and Check if the number 
 * is palindrome number or not. If it is palindrome return true, otherwise return false.
For example ,
isPalindrome(121)-> should return true
isPalindrome(12343)-> should return false because the reverse is 34321 and it is not equal to 12343.*/
public class NumberPalindrome {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter any number:");
			int n = sc.nextInt();
			if(isPalindrome(n)) {
				System.out.println("Number is palindrome: "+n);
			}
			else {
				System.out.println("Number is not palindrome: "+n);
			}
		}
	}
	public static boolean isPalindrome(int num) {
		int rev=0, temp,d;
		temp=num;
		while(temp>0) {
			d=temp%10;
			rev=(rev*10)+d;
			temp=temp/10;
		
		}
		
		if(num == rev) {
			return true;
		}
		else {
			return false;
		}
	}
}
