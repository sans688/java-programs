package string;

import java.util.Scanner;

public class CharacterfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.nextLine();
		
		System.out.println("Enter Index:");
		int index = sc.nextInt();
		
		char ch = s.charAt(index);
		System.out.println(ch);
		
	}

}
