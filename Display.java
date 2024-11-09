
package com_edu;
import java.util.*;
//write a java program to read your name, age, salary,
//gender and display them user Scanner class
public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = s.next();
		System.out.println("Enter Age:");
		int age = s.nextInt();
		System.out.println("Enter Salary:");
		float salary=s.nextFloat();
		System.out.println("Enter Gender:");
		char gender =s.next().charAt(0);
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(gender);
		
	}

}
