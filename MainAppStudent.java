package com_edu;

import java.util.Scanner;


class Student{
	 //instance variable
	  String name;
	  int age;
	  float fees;
	  char gen;
	  int marks;


	   void inputData(){ //member methods
	       Scanner scanner = new Scanner(System.in);
	       System.out.println("Enter name");
	       name = scanner.next();
	       System.out.println("Enter age ");
	       age = scanner.nextInt();
	       System.out.println("Enter gender");
	       gen = scanner.next().charAt(0);
	       System.out.println("Enter fees");
	       fees = scanner.nextFloat();
	       System.out.println("Enter total marks");
	       marks = scanner.nextInt();
	         
	   }


	  void displayData(){
	      System.out.println("Name = "+name);
	      System.out.println("Age = "+age);
	      System.out.println("Fees = "+fees);
	      System.out.println("gender = "+gen);
	      System.out.println( "Marks= "+marks);
	  }


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", fees=" + fees + ", gen=" + gen + ", marks=" + marks + "]";
	}


	
	  


	}




public class MainAppStudent {


	public static void main(String[] args) {
		System.out.println("Main method");
		
		Student student = new Student();
		Student student1 = new Student();
		System.out.println(student);
		System.out.println(student1);
		System.out.println(student.name);
		System.out.println(student.age);
		System.out.println(student.fees);
		
		student.inputData();
		student.displayData();
		student1.inputData();
		student1.displayData();
		
Student student3[] = new Student[2]; //declaration of array
		
		for(int i=0;i<student3.length;i++) {
			student3[i]=new Student();
			student3[i].inputData();
		}
		
		//display all student data
		for(int i=0;i<student3.length;i++) {
		    student3[i].displayData();
		}
		


	}


}


/*
 * Create Employee class 
 * name, age , salary, emailid, phone
 */