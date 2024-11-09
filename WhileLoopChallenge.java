package java_prep;

import java.util.Scanner;

/*Declare a variable n which will store the digit, whose table we need to print.
 *  Declare two more variables i and table.
 * I will be our iterator, and table will store the calculated output. Which we need to print.*/
public class WhileLoopChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i=1, table;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		n=sc.nextInt();
		while(i<=10) {
			table = n*i;
			System.out.println(n+" * "+i+" = "+table);
			i++;
		}
	}

}
