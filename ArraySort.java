package com.array;

import java.util.Scanner;

//BubbleSort
public class ArraySort {

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
		System.out.print("Array elements are: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-1-i; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
			}
		}
		System.out.println("Sorted Elements of Array");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
