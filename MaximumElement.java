package java_prep;

import java.util.Scanner;

public class MaximumElement {

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
		MaximumElement m = new MaximumElement();
		m.display(arr1);
		m.MaxElement(arr1);
		
	}
	
	public  void MaxElement(int arr[]) {
		int max =arr[0];
		for(int i =0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Maximum element of array is "+max);
	}
	void display(int arr[]) {
		System.out.println("Elements of array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
