package java_prep;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {88,85,65,75,86,84,75,55};
		ArrayAverage ar = new ArrayAverage();
		System.out.println(ar.AverageMarks(marks));
	}
	public double  AverageMarks(int arr[]) {
		
		int sum=0;
		for(int element : arr) {
			sum += element;
		}
		System.out.println("Sum of marks: "+sum);
		 double avg = sum/arr.length;
		
		return avg;
	}

}
