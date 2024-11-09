package java_prep;

import java.util.Scanner;

/*Declare a string variable student_name and a int variable student_score. calculate student division by using student_score variable.
 * 
Student division can be calculated as :

if student_score>=80, print "A" division

else if student_score >=60 and <80, print "B" division

else if student_score>=40 and <60, print "C" division

else if student_score<40, print "F" division.*/
public class Assessment1 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Student Name:");
			String student_name=sc.next();
			System.out.println("Enter Student Score:");
			int student_score=sc.nextInt();
			char student_division = divisionCalculation(student_score);
			display(student_name,student_division);
		}
		
	}
	public static char divisionCalculation(int student_score) {
		char division; 
		if(student_score>=80) {
			division='A';
			return division;
		}
		else if(student_score >=60 && student_score<80) {
			division='B';
			return division;
		}
		else if(student_score >=40 && student_score<60) {
			division='C';
			return division;
		}
		else if(student_score <40){
			division='F';
			return division;
		}
		return 0;
	}
	public static void display(String sname, char sdivision) {
		System.out.println("Student Name is "+sname+" Division scored is "+sdivision);
	}
	
		
	

}
