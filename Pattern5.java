package pattern;

import java.util.Scanner;

/*
     *
    * *
   * * *
  * * * * 
 * * * * *
 */
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of rows");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k =1; k<=i; k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}