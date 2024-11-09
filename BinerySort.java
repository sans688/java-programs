package com.array;

import java.util.Scanner;

public class BinerySort {

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
		System.out.println();
		System.out.println("Enter the element you want to search: ");
		int keyelemnet = scanner.nextInt();
		int low=0, high=array.length-1;
		int mid, pos=0;
		while(low<=high) {
			mid=(low + high)/2;
			if(keyelemnet ==array[mid]) {
				pos=mid;
				break;
			}
			else if(keyelemnet > array[mid]) {
				low=mid+1;
			}
			else if(keyelemnet < array[mid]) {
				high=mid+1;
			}
		}
		if(pos >0) {
			System.out.println("Successfull search");
			System.out.println(keyelemnet+" found at position "+(pos+1));
		}
		else {
			System.out.println("Unsuccessful search");
	
		}
		
	}

}
