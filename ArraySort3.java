package java_prep;

import java.util.Scanner;

//Array sort using user define array
public class ArraySort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int ele =sc.nextInt() ;
		int[] arr = new int[ele];
		System.out.println("Enter elemnets of array");
		for(int i =0;i<ele; i++ ) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array before sorting");
		for(int i =0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		ArraySort3 a = new ArraySort3();
		System.out.println("Array after sorting");
		a.sortArray(arr);
		
	}
	
	public void sortArray(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int temp = 0;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}

}
