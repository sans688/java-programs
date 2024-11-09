package array;

import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,5,2,3,6};
		int[] arr2 = {1,5,2,3,6};
		 if(Arrays.equals(arr1,arr2)) {
			 System.out.println("Arrays are same");
			 
		 }
		 else {
			 System.out.println("Not same");
		 }
		 
		 if(arr1 == arr2) {
			 System.out.println("Arrays are same");
			 
		 }
		 else {
			 System.out.println("Not same");
		 }
	}
	
	

}
