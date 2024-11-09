package com_edu;

import java.util.Scanner;

class Employee{
	String name;
	int age;
	double salary;
	long phone;
	String email;
	
	void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		name = sc.next();
		
		System.out.println("Enter Age:");
		age = sc.nextInt();
		
		System.out.println("Enter Salary:");
		salary = sc.nextDouble();
		
		System.out.println("Enter Phone No.:");
		phone = sc.nextLong();
		
		System.out.println("Enter Email-Id:");
		email = sc.next();
	}
	void displayData(){
	      System.out.println("Name = "+name);
	      System.out.println("Age = "+age);
	      System.out.println("Salary = "+salary);
	      System.out.println("Phone No. = "+phone);
	      System.out.println( "Email-Id = "+email);
	  }
}
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em = new Employee();
		Employee em1 = new Employee();
		em.inputData();
		em.displayData();
		
		em1.inputData();
		em1.displayData();
	}

}
