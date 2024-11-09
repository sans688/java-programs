package java_prep;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="Sanskriti";
		int studentmarks=85;
		char studentGrade = gradeCalculator(studentmarks);
		Display(name,studentGrade);
		/*
		or we can use this to call to
		Display(name,gradeCalculator(studentmarks));
		*/
	}
	
	public static char gradeCalculator(int marks) {
		char grade;
		if(marks>=90)  {
			grade = 'A';	
		}
		else if(marks<90 && marks>=80) {
			grade = 'B';
		}
		else if(marks<80 && marks>=70) {
			grade = 'C';
		}
		else if(marks<70 && marks>=60) {
			grade = 'D';
		}
		else if(marks<60 && marks>=50) {
			grade = 'E';
		}
		else{
			grade = 'F';
		}
		return grade;
		
	}
	public static void Display(String sname, char sgrade) {
		System.out.println("Name of student: " + sname);
		System.out.println("Grade of student: " +sgrade);
	}
}
