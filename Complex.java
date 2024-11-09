package com.company;
/*A complex number is a number that can be expressed in the form a+bi, where a and b are real numbers,
 *  and i is a solution of equation x2=-1.  

Write a program to Add and subtract  two complex numbers by creating a class Complex number in which :  

The complex numbers will be initialized with the help of the constructor.
The addition and subtraction will be performed with the help of function calling.
  Example :

Input : a1= 4 b1=8 a2=5 b2=7  

Output : Sum = 9+ i15 Difference = -1+i  

Explanation:

(4 + i8) + (5 + i7)

= (4 + 5) + i(8 + 7)

= 9 + i15 (4 + i8) - (5 + i7)

= (4 - 5) + i(8 - 7)

= -1 + i*/
public class Complex {
	int real, imaginary;
	public Complex() {
		
	}
	public Complex(int real, int imaginary) {
		// TODO Auto-generated constructor stub
		this.real = real;
		this.imaginary = imaginary;
	}
	Complex Addition(Complex c1, Complex c2) {
		Complex temp = new Complex();
		temp.real = c1.real + c2.real;
		temp.imaginary = c1.imaginary + c2.imaginary;
		return temp;
		
	}
	Complex Subtraction(Complex c1, Complex c2) {
		Complex temp = new Complex();
		temp.real = c1.real - c2.real;
		temp.imaginary = c1.imaginary - c2.imaginary;
		return temp;
	}
	public void printComplex() {
		System.out.println("Complex number:"+real+"+"+imaginary+"i");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(4,8);
		Complex c2 = new Complex(5,7);
		c1.printComplex();
		c2.printComplex();
		
		Complex c3 = new Complex();
		c3=c3.Addition(c1, c2);
		System.out.print("Sum is ");
		c3.printComplex();
		
		c3=c3.Subtraction(c1, c2);
		System.out.print("Difference is ");
		c3.printComplex();
	}

}
