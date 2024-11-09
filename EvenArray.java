package com.array;

import java.util.Scanner;

//write a program to print even numbers from array
//
public class EvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements elements: ");
		int num = scanner.nextInt();
		int[] array = new int[num];
		System.out.println("Enter array elements");
		for(int i=0; i<num; i++) {
			array[i]=scanner.nextInt();
		}
		//display array elements
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("Even Numbers");
		for(int i=0;i<array.length;i++) {
			if(array[i]%2 ==0) {
				System.out.print(array[i]+" ");
				
			}
			
		}
		System.out.println("Even index Numbers");
		for(int i=0;i<array.length;i++) {
			if(i%2 ==0) {
				System.out.println(array[i]+" ");
				
			}
		
		}
	}

}
