package java_prep;

import java.util.Arrays;

// Array sort using sort()
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,1,45,71,12,58,42,10};
		System.out.println("Unsorted Array!");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(arr);
		System.out.println("Sorted Array!");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
