package java_prep;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] arr = {70.5f, 85.5f, 45.12f, 62.45f, 10.25f};
		float sum=0;
		for(float element: arr) {
			sum += element;
		}
		System.out.println(sum);
	
	}
}
