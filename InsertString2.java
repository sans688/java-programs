package string;

import java.util.Scanner;

//using StringBuffer function
public class InsertString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String original_String = sc.nextLine();
		System.out.println("Enter String to be inserted:");
		String stringToBeInserted = sc.nextLine();
		System.out.println("Enter Index:");
		int index = sc.nextInt();
		
		System.out.println("Original String:"+original_String);
		System.out.println("String to be Inserted:"+stringToBeInserted);
		System.out.println("Index:"+index);
		
		System.out.println("Modified String:"+InsertString(original_String, stringToBeInserted, index));
		
	}
	public static String InsertString(String original_String,String stringToBeInserted, int index) {
		StringBuilder newString = new StringBuilder(original_String);
		 newString.insert(index+1, stringToBeInserted);
		 return newString.toString();
	
	}
}
