package string;

import java.util.Scanner;

//using String.toCharArray()
public class CharacterfromString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		System.out.println("Enter Index:");
		int index = sc.nextInt();
		char ch=' ';
		for(int i =0;i<c.length; i++) {
			 if(i==index) {
				 ch=c[i];
			 }
		}
		System.out.println(ch);
	}

}
