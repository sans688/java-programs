package java_prep;

import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of elements:");
		int ele = sc.nextInt();
		int[] arr1 = new int [ele];
		 
		//taking input of first matrix 
				System.out.println("Enter elements for matrix 1: ");
				for(int i=0; i<ele; i++) {
						arr1[i]= sc.nextInt();
				}
		SortedArray m = new SortedArray();
		m.display(arr1);
		if(m.Sort(arr1)) {
			System.out.println("Array is Sorted");
		}
		else {
			System.out.println("Array is not sorted");
		}
	}

	public  boolean Sort(int arr[]) {
		int size =arr.length;
		if(size ==1 || size ==0) {
			return true;
		}
		for(int i =1; i<size; i++) {
			if(arr[i-1]> arr[i]) {
				return false;
			}
			
		}
		return true;
		
	}
	void display(int arr[]) {
		System.out.println("Elements of array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
