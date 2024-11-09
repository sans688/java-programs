package java_prep;
/*
Write a method named getOddDigitSum with one parameter of type int called number.  

The method should return the sum of the odd digits within the number.  

If the number is negative, the method should return -1 to indicate an invalid value.

  EXAMPLE INPUT/OUTPUT:  

getOddDigitSum(123456789); → should return 25 since 1 + 3 + 5 + 7 +9 = 25
getEvenDigitSum(252); → should return 5 since 5 is the only odd digit in the number
getEvenDigitSum(-22); → should return -1 since the number is negative.*/
public class OddDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getOddDigitSum(123456789));
		System.out.println(getOddDigitSum(252));
		System.out.println(getOddDigitSum(-22));
	}
	public static int getOddDigitSum(int num) {
		int sum=0,temp;
		if(num <0) {
			return -1;
		}
		while (num>0) {
			temp = num%10;
			if(temp % 2!=0) {
				sum=sum+temp;
			}
			num/=10;
		}
		return sum;
		
	}

}
