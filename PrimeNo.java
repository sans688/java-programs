package java_prep;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter number:");
		int num = sc.nextInt();
		isPrime(num);	
		
	}
}	

	public static void isPrime(int n) {
		// TODO Auto-generated method stub
		int count=0;
		if(n==1 && n==0) {
			System.out.println("Number is Not Prime:"+n);
		}
		else {
			for(int i =1; i<=n; i++) {
				if(n % i == 0) {
					count++;
				}	
			}
		}
		if(count ==2) {
			System.out.println(n+" is prime");
		}
		else {
			System.out.println(n+" is not prime");
		}
	}
}
