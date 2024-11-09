package string;

import java.util.Scanner;

public class EvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Even(s);


		
	}
	public static void Even(String s) {
		String[] words = s.split(" ");
		
		for(String w : words) {
			if(w.length()%2==0) {
				System.out.println(w);
			}
			}
		
	}
	

}
