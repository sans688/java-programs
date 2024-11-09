package string;

import java.util.Scanner;

public class EvenWord2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		printEven(s);
	}
	public static void printEven(String s) {
		String [] words = s.split(" ");
		//to store length of each word
		int[] wordlength = new int[words.length];
		
		//cal length of each word and store in an array
		for(int i=0;i<words.length; i++) {
			wordlength[i]=words[i].length();
			
		}
		
		for (int i = 0; i < words.length; i++) {
            if (wordlength[i] % 2 == 0) {
                System.out.println(words[i]);
            }
        }
	}

}
