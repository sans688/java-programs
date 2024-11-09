package string;

import java.util.Scanner;

//using substring
public class InsertChar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String original_String = sc.nextLine();
		System.out.println("Enter char to be inserted:");
		char charToBeInserted = sc.next().charAt(0);
		System.out.println("Enter Index:");
		int index = sc.nextInt();
		
		System.out.println("Original String:"+original_String);
		System.out.println("String to be Inserted:"+charToBeInserted);
		
		
		System.out.println("Modified String:"+InsertChar(original_String, charToBeInserted, index));
	}

	private static String InsertChar(String original_String, char charToBeInserted, int index) {
		// TODO Auto-generated method stub
		String newString = original_String.substring(0,index)+charToBeInserted+original_String.substring(index);
		return newString;
	}

}
