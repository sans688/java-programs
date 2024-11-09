package com.company;
/*
Write a class with the name Name. The class needs two fields (instance variables) with names 
firstName and lastName both of type string.  

Write the following methods (instance methods):

Method named getFirstName without any parameter, it needs to return the value of firName field.
Method name getLastName without any parameter, it needs to return the value of lastName field.
Method named setFirstName with one parameter of type string, it needs to set the value of 
firstName field.
Method named setLastName with one parameter of type string, it needs to set the value of 
lastName field.
Method named getName without any parameters, it need to return the full name i.e. 
“firstName space lastName”.
  For example ,  

setFirstName(“Sudhir”)-> set the value of firstName as “Sudhir”.
setLastName(“Dhangar”)-> set the value of lastName as “dhangar”.
getName()-> it will return the full name as “Sudhir Dhangar”.*/
public class PrintFullNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n1 = new Name();
		n1.setFirstName("Sudhir");
		n1.setLastName("Dhangar");
		System.out.println(n1.getName());
		
	}

}
class Name{
	private String firstName;
	private String lastName;
	
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
	
	public String getName() {
		return firstName+" "+lastName ;
	}
}
