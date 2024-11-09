package com.company;
/*
 Write a class with the name Student. The class needs three fields (instance variables) with the names firstName, 
 lastName of type String and marks of type int.  

Write the following methods (instance methods):  

Method named getFirstName without any parameters, it needs to return the value of the firstName field.
Method named getLastName without any parameters, it needs to return the value of the lastName field.
Method named getMarks without any parameters, it needs to return the value of the marks field.
Method named setFirstName with one parameter of type String, it needs to set the value of the 
firstName field.
Method named setLastName with one parameter of type String, it needs to set the value of the 
lastName field.
Method named setMarks with one parameter of type int, it needs to set the value of the marks field. 
If the parameter is less than 0 or greater than 100, it needs to set the marks field value to 0.
Method named isPass without any parameters, it needs to return true if the value of the marks field
 is greater than or equal to 33 and less than or equal to 100, otherwise, return false.

Method named getFullName without any parameters, it needs to return the full name of the person.   '
In case both firstName and lastName fields are empty, Strings return an empty String.
In case lastName is an empty String, return firstName.

In case firstName is an empty String, return lastName.    

TEST EXAMPLE   TEST CODE:  

Student student = new Student();

student.setFirstName("");   // firstName is set to empty string

student.setLastName("");    // lastName is set to empty string

student.setMarks(10);

System.out.println("fullName= " + student.getFullName());

System.out.println("pass= " + student.isPass());

student.setFirstName("Sudhir");    // firstName is set to Sudhir

student.setMarks(80);

System.out.println("fullName= " + student.getFullName());

System.out.println("pass= " + studen.isPass());

student.setLastName("Dhangar");    // lastName is set to Dhangar

System.out.println("fullName= " + student.getFullName());  

OUTPUT  

fullName=

pass= false

fullName= Sudhir

pass= true

fullName=Sudhir Dhangar*/
public class Student {
	private String firstName;
	private String lastName;
	private int marks;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	} 
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setMarks(int marks) {
		if(this.marks<0 || this.marks>100) {
			marks = 0;
		}
		else {
			this.marks=marks;
		}
	}
	
	public boolean isPass() {
		if(marks >=33 && marks<=100) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getFullName() {
		return firstName+" "+lastName;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setFirstName("");
		student.setLastName("");
		student.setMarks(10);
		
		System.out.println("FullName= " + student.getFullName());

		System.out.println("pass= " + student.isPass());

		student.setFirstName("Sudhir");    // firstName is set to Sudhir

		student.setMarks(80);//true

		System.out.println("FullName= " + student.getFullName());

		System.out.println("pass= " + student.isPass());

		student.setLastName("Dhangar");    // lastName is set to Dhangar

		System.out.println("FullName= " + student.getFullName());  
	}

}
