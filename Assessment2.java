package java_prep;

import java.util.Scanner;

/*Declare a double variable weightKgs and take input from the user in kilograms.
 * Also, Create a method convert(double kgs) and convert the weight to grams and milligrams.*/
public class Assessment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight in kilograms: ");
		double weightKgs = sc.nextDouble();
		convert(weightKgs);
	}
	public static void convert(double kgs) {
		double grams , miligrams; 
		grams = kgs * 1000;
		miligrams = kgs * 1000000;
		System.out.println("Kilograms to grams: "+grams);
		System.out.println("Kilograms to miligrams: "+miligrams);
	}
	

}
