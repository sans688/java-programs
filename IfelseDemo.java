package com_edu;

import java.util.Scanner;

public class IfelseDemo {
	int no, no1, no2, no3;
	Scanner sc = new Scanner(System.in);
	void posNeg() {
		System.out.println("Enter no: ");
		no = sc.nextInt();
		if(no >0) {
			System.out.println(no+" is positive");
		}	
		else {
			System.out.println(no+" is nagative");
		}
	}
	
	void evenOdd() {
		System.out.println("Enter no: ");
		no = sc.nextInt();
		if(no % 2 == 0) {
			System.out.println(no+" is Even number");
		}
		else {
			System.out.println(no+" is Even number");
		}
	}
	void max() {
		System.out.println("Enter no1: ");
		no1 = sc.nextInt();
		System.out.println("Enter no2: ");
		no2 = sc.nextInt();
		System.out.println("Enter no3: ");
		no3= sc.nextInt();
		
		if(no1>no2 && no1>no3) {
			
				System.out.println(no1+" is greater.");
		}
		else if(no2>no1 && no2>no3){
			
				System.out.println(no2+" is greater.");
			
		}
		else {
			System.out.println(no3+" is greater.");
		}
	}
	
	void max2() {
		System.out.println("Enter no1: ");
		no1 = sc.nextInt();
		System.out.println("Enter no2: ");
		no2 = sc.nextInt();
		System.out.println("Enter no3: ");
		no3= sc.nextInt();
		
		if(no1>no2 ) {
			if(no1>no3) 
			{
				System.out.println(no1+" is greater.");
			}
			else {
				System.out.println(no3+" is greater");
			}
		}
		else {
			if(no2>no3) {
				System.out.println(no2+" is greater.");
			}
			else {
				System.out.println(no3+" is greater");
			}
		}
	}
	void min() {
		System.out.println("Enter no1: ");
		no1 = sc.nextInt();
		System.out.println("Enter no2: ");
		no2 = sc.nextInt();
		System.out.println("Enter no3: ");
		no3= sc.nextInt();
		
		if(no1<no2 ) {
			if(no1<no3) 
			{
				System.out.println(no1+" is smallest.");
			}
			else {
				System.out.println(no3+" is smallest");
			}
		}
		else {
			if(no2<no3) {
				System.out.println(no2+" is smallest.");
			}
			else {
				System.out.println(no3+" is smallest");
			}
		}
	}
	
	// swapping 2 variables using third variable
	void swap() {
		System.out.println("Enter no1: ");
		no1 = sc.nextInt();
		System.out.println("Enter no2: ");
		no2 = sc.nextInt();
		int temp =no1;
		no1=no2;
		no2=temp;
		System.out.println(no1);
		System.out.println(no2);
		
		
	}
	// swapping 2 variables without using third variable
		void swap2() {
			System.out.println("Enter no1: ");
			no1 = sc.nextInt();
			System.out.println("Enter no2: ");
			no2 = sc.nextInt();
			no1=no1+no2;
			no2=no1-no2;
			no1=no1-no2;
			System.out.println(no1);
			System.out.println(no2);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfelseDemo i = new IfelseDemo();
		//i.max2();
		//i.min();
		i.swap2();
	}

}
