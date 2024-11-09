package java_prep;
/*
Declare two integer variables as length and breadth, and one double variable as height for storing the dimensions of the figures.

Declare three double variables as sq_area, rect_area, and tri_area, for calculating the area of the three figures.

Create three different methods as follows:

area(int length) - for calculating the area of the square.

area(int length, int breadth) - for calculating the area of the rectangle.

area(int breadth, double height) - for calculating the area of the triangle.*/
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
		int l, b;
		double h, sq_area, rect_area, tri_area;
		System.out.println("Enter length, breadth and height:");
		l=sc.nextInt();
		b= sc.nextInt();
		h=sc.nextDouble();
		sq_area = area(l);
		System.out.println("Area of square: "+sq_area);
		
		rect_area = area(l,b);
		System.out.println("Area of rectangle: "+rect_area);
		
		tri_area = area(b,h);
		System.out.println("Area of triangle: "+tri_area);
		
		}
		
	}
	public static double area(int side) {
		double area = side * side;
		return area;
	}
	public static double area(int length, int breadth) {
		double area = length * breadth;
		return area;
	}
	public static double area(int breadth, double height) {
		double area = 0.5 * breadth * height;
		return area;
	}

}
