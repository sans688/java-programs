package java_prep;

import java.util.Scanner;

/*Write a method named hasNotTeen with 3 parameters of type int.

We’ll say that a number is  “teen” if it is in the range 13..19 inclusive, otherwise it is not teen. 
Given 3 int values, return true if none of them are teen, otherwise return false..

Example 

Sample Input 1 :

13 12 20

Sample Output 1:

False

Explanation:

Since 13 is a teen number, hence false is returned.

 

Sample Input 2:

9 29 21

Sample output 2:

True

Explanation:

Since numbers 9,29,21 are not in range 13-19, hence true is returned.  */
public class TeenNumberChecker {
	public static boolean hasNotTeen(int num1,int num2 ,int num3) {
		if(num1>=13 && num1<=19)
				{return false;}
		else if(num2>=13 && num2<=19) 
			{return false;}
		else if(num3>=13 && num3<=19)
		{
			return false;
		}
		else {
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter any 3 numbers:");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int n3=sc.nextInt();
			boolean notteen=hasNotTeen(n1,n2,n3);
			System.out.println(notteen);		}
	}

}
