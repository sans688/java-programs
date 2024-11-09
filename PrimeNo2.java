package java_prep;

import java.util.Scanner;

/*
A prime number is a number which is divisible by 1 and itself.

Print Prime numbers from 1 to n.*/
public class PrimeNo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range:");
		int num = sc.nextInt();
		
		for(int i =1; i<=num; i++)
		{
			isprime(i);
			
		}
		
	}
	public static void isprime(int n) {
		boolean flag=true;
		if(n <=1) {
			System.out.println(n+" number is not prime");
			
		}
		else {
			for(int i =2; i<=n; i++) {
				if(n%i==0) {
					//count++;
				}
			}
	/*		if(count == 0) {
				System.out.println(n+" number is prime");
			}
			else {
				System.out.println(n+" number is not prime");
			}*/
		}
	}

}
