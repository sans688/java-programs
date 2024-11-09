package java_prep;


import java.util.Scanner;

/*
Write a program to accept three number and check whether they are pythagorean triplet or not.*/
public class PythagoreanTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three sides of triangle:");
		int side1= sc.nextInt();
		int side2= sc.nextInt();
		int side3= sc.nextInt();
		toCheck(side1, side2, side3);
	}
	public static void toCheck(int s1, int s2, int s3) {
		/*int side3= (s1^2) + (s2^2) ;
		s3 = s3^2;
		if(s3 == side3) {
			System.out.println("Triangle have pythagorean triplet");
		}
		else {
			System.out.println("Triangle not have pythagorean triplet");
		}*/
		int p, q , r;
		p= s1*s1;
		q= s2*s2;
		r=s3*s3;
		if((p+q)==r) {
		 System.out.println(s1 + " " + s2 + " and " + s3 + " are Pythagorean Triplets");
		} else {
        System.out.println(s1 + " " + s2 + " and " + s3 + " are not Pythagorean Triplets");

		}
		
	}

}
