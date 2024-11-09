package java_prep;
//Array sort  using for loop without sort() method
public class ArraySort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[]{1,5,2,4,15,10,8,9,100};
		System.out.println("Unsorted Array!");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//sorting array
		System.out.println("Sorted Array!");
		for(int i=0; i<arr.length; i++) {
			for(int j =i+1; j<arr.length; j++) {
				int temp=0;
				if(arr[i]> arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}

}
