package java_prep;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,45,75,85,65,85};
		ArraySearch ar = new ArraySearch();
		int result=ar.searchElement(arr);
		System.out.println(result);
		
	}
	public static int searchElement(int arr[]) {
		int num=12;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]==num) {
				
				return 1;
			}
		}
		return -1;
	}

}
