package java_prep;

public class SumOfMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1; i<=10; i++) {
			int result = i*8;
			//System.out.println(result);
			sum += result;
		}
		System.out.println("Sum of number occuring in multiplication: "+sum);
	}

}
