package string;

import java.util.Scanner;

public class InsertIntoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Inserted int another String:"+InsertString(s));
	}
	public static String InsertString(String s) {
		String s2 ="";
		char[] ch = s.toCharArray();
		for(int i = 0; i<ch.length; i++) {
			s2=s2+ch[i];
		}
		return s2;
	}
}
