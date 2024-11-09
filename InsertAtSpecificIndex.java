package string;

import java.util.Scanner;

public class InsertAtSpecificIndex {

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
	
	public static String InsertString(String original_String, String stringToBeInserted,int index) {
		String newString = "";
		
		for(int i= 0; i<original_String.length();i++) {
			if(i==index) {
				newString += stringToBeInserted;
			}
			newString += original_String.charAt(i);
			
		}
		return newString;
	}

}
