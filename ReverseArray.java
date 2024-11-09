package java_prep;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,6,7,8,9};
		//int i =arr.length;
		
		System.out.print("Printing array in original order: ");
		//foreach in java can be written as follow:
		for(int element : arr ) {
			System.out.print(" "+element);
		}
		System.out.println();
		System.out.print("Printing array in reverse order: ");
		for(int i=arr.length-1; i>=0; i-- ) {
			System.out.print(" "+arr[i]);
		}
	}

}
