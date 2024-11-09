package string;

import java.util.Scanner;

//to capitalize first letter of each word in string 
public class Capitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String s = sc.nextLine();
		String s1 = capitalizeWord(s);
		System.out.print(s1);
		
}
	public static String capitalizeWord(String s) {
		 String words[]=s.split("\\s");  
		    String capitalizeWord="";  
		    for(String w:words){  
		        String first=w.substring(0,1);  
		        String afterfirst=w.substring(1);  
		        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
		    }  
		    return capitalizeWord.trim();  
		}  

}
