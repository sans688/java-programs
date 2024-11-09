package array;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,5,6,3};
		int n = arr.length;
		PeakElement p = new PeakElement();
		System.out.println("Index of a peak point is "+p.findPeak(arr, n));
		
	}
	public int findPeak(int arr[], int n) {
		if(n==1) {
			return 0;
		}
		if(arr[0]>= arr[1]) {
			return 0;
		}
		if(arr[n-1]>=arr[n-2]) {
			return n-1;
		}
		for(int i =1; i<n-1; i++) {
			if((arr[i]>=arr[i-1])&& (arr[i]>=arr[i+1])) {
				return i;
			}
			
		}
		return 0;
	} 
}
