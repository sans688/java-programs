package java_prep;

import java.util.Scanner;

/*Ask for a number from the user for which he wants to print a table for. 
 * The message should be “Please enter the number for which you want to print the table” . 
 * Store that number in a variable n, create a method printTheTable, for calculating and printing 
 * the table for n. Use Scanner method for accepting the input frm the user.*/
public class ReadingUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number for which you want to print the table:");
		int num = sc.nextInt();
		printTheTable(num);
	}
	public static void printTheTable(int n) {
		int mul;
		for(int i =1; i<=10; i++) {
			mul = i*n;
			System.out.println(i+" * "+n+" ="+mul);
		}
	}
}
