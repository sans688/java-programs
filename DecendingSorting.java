package java_prep;

import java.util.Scanner;

public class DecendingSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int ele = sc.nextInt();
		System.out.println("Enter elements of an array: ");
		int [] arr = new int[ele];
		for(int i=0; i<ele;i++ ){
			arr[i]=sc.nextInt();
		}
		System.out.println("Unsorted Array");
		for(int i=0; i<ele;i++ ){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Sorted Array");
		DecendingSorting des = new DecendingSorting();
		des.DescendingArray(arr);
	}
	public  void DescendingArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int temp=0;
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
}
