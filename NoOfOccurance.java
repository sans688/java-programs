package array;

import java.util.Scanner;

public class NoOfOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of element for array:");
		int ele = sc.nextInt();
		System.out.println("Enter elements for array:");
		int[] arr = new int[ele];
		for(int i =0; i<ele; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter number whoes occurance you want to check: ");
		int n = sc.nextInt();
	
		
		NoOfOccurance a = new NoOfOccurance();
		a.diaplay(arr);
		a.Occurance(arr, n);
		
	}
	public void Occurance(int[]arr, int n) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==n) {
				count++;
			}
		}
		System.out.println("Number of occurance of "+n+" is "+count);
	}
	public void diaplay(int []arr) {
		System.out.println("Array:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
