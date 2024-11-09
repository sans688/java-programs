package java_prep;

import java.util.Scanner;

/*Create a integer variable kiloBytes and take a input from the user in kiloBytes. 
* Now, create a method named  printMegaBytes(int kiloBytes) and convert the kiloBytes into MegaBYtes.  

For example, if we divide the Kilobytes by 1024 , It will give the Megabytes(MB).*/
public class Assessment3 {

	    public static void printMegaBytes(int kiloBytes){

	        if (kiloBytes < 0){
	            System.out.println("Invalid Value");
	        } else {
	            int megabytes = (kiloBytes/1024);
	            int kiloRemainder = kiloBytes%1024;
	            System.out.println(kiloBytes+" KB = "+megabytes+" MB and "+kiloRemainder+" KB");
	        }

	    }

	    public static void main(String[] args){
	        try (Scanner sc = new Scanner(System.in)) {
				int kiloBytes=sc.nextInt();
				printMegaBytes(kiloBytes);
			}
	    }    
	}