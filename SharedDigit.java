package java_prep;
/*
Write a method named hasSharedDigit with two parameters of type int.  
Each number should be within the range of 10 (inclusive) - 99 (inclusive).
 If one of the numbers is not within the range, the method should return false.  
The method should return true if there is a digit that appears in both numbers, 
such as 2 in 12 and 23; otherwise, the method should return false.

  EXAMPLE INPUT/OUTPUT:  

hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers*/
public class SharedDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasSharedDigit(12, 23));
		System.out.println(hasSharedDigit(9,99));
		System.out.println(hasSharedDigit(15,55));
	}

	
	public static boolean hasSharedDigit(int num1, int num2) {
		if((num1>=10 && num1<=99)&& (num2>=10 && num2<=99) ){
			boolean answer = false;        
			int lefta = num1/10;        
			int righta = num1 % 10;        
			int leftb = num2/10;
			int rightb = num2 % 10;       
			 if(lefta == leftb || lefta == rightb || righta == leftb || righta == rightb){
				 answer = true;          }        
			return answer; 
		}
		return false;
	
		
		
		}
	
}
