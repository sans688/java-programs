package java_prep;

import java.util.Scanner;

public class MinimunArray {

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
		MinimunArray m = new MinimunArray();
		m.display(arr1);
		m.MinElement(arr1);
	}
	public  void MinElement(int arr[]) {
		int min =arr[0];
		for(int i =0; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Minimum element of array is "+min);
	}
	void display(int arr[]) {
		System.out.println("Elements of array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
