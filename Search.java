package com.array;

import java.util.Scanner;

public class Search {

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
		System.out.println("Enter the element you want to search: ");
		int search = scanner.nextInt();
		int pos=0;
		for(int i=0; i<array.length; i++) {
			if(search == array[i]) {
				pos = i+1;
				break;
			}
		}
		if(pos>0) {
			System.out.println("Successful search");
			System.out.println("Element found at position "+pos);
		}
		else {
			System.out.println("Unsuccessful search");
		}
	}

}
