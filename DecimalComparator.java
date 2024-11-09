package java_prep;
/*
 Write a method areEqualByFiveDecimalPlaces with three parameters of type double.
 The method should return boolean and it needs to return true if three double numbers are the 
 same up to five decimal places.Otherwise, return false.  

Example 

areEqualByFiveDecimalPlaces(1.176231, 1.176232, 1.176233) -> should return true since number are equal up to 5 decimal places.
areEqualByFiveDecimalPlaces(2.23543, 2.235432, 2.235451) -> should return false since numbers are not equal up to 5 decimal places.  
 * */
public class DecimalComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(areEqualByFiveDecimalPlaces(1.176231, 1.176232, 1.176233));  //-> should return true since number are equal up to 5 decimal places.
		System.out.println(areEqualByFiveDecimalPlaces(2.23543, 2.235432, 2.235451)) ;

	}
	public static boolean areEqualByFiveDecimalPlaces(double num1, double num2, double num3) {
		num1 = Math.round(num1 * 100000);
		num2 = Math.round(num2 * 100000);
		num3 = Math.round(num3 * 100000);
		return (num1 == num2) && (num2==num3);
	}
	

}
