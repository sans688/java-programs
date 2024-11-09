package string;

import java.util.Scanner;

//insert char using +operator both at start and end
public class InsertChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String original_String = sc.nextLine();
		System.out.println("Enter char to be inserted:");
		char charToBeInserted = sc.next().charAt(0);
		
		
		System.out.println("Original String:"+original_String);
		System.out.println("String to be Inserted:"+charToBeInserted);
		
		
		System.out.println("Modified String:"+InsertCharAtStart(original_String, charToBeInserted));
		System.out.println("Modified String:"+InsertCharAtEnd(original_String, charToBeInserted));
		
	}

	private static String InsertCharAtStart(String original_String, char charToBeInserted) {
		// TODO Auto-generated method stub
		String newString = charToBeInserted + original_String;
		return newString ;
	}
	private static String InsertCharAtEnd(String original_String, char charToBeInserted) {
		// TODO Auto-generated method stub
		String newString = original_String+charToBeInserted;
		return newString ;
	}

}
