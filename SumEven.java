package java_prep;
/*
Write a method called isEven with an int parameter and call it number. 
The method needs to return a boolean.
Check that number is >0, if it is not return false. 
If number is even return true, otherwise return false.  
Write a second method called sumEven that has 2 int parameters start and end, 
which represent a range of numbers.  
The method should use a for loop to sum all even numbers in that range including the end and 
return the sum.  
It should call the method isEven to check if each number is even. 
The parameter end need to be greater than or equal to start and both start and end parameters have to be greater than 0.  
If those conditions are not satisfied return -1 from the method to indicate invalid input.  

Example input/output :

sumEven(1,100) return
sumEven(-1,100)-> should return -1
sumEven(10,10)->should return 10*/
public class SumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(sumEven(1,100));
        System.out.println(sumEven(-1,100));
        System.out.println(sumEven(10,10));
	}
	public static boolean isEven(int number) {
		if(number<=0) {
            return false;}
        if(number%2==0) {
            return true;}
        return false;
	}
	public static int sumEven(int start, int end) {
		if(start<0 && end<0) {
			return -1;
		}
		 if(end<=0 || start<=0) {
	            return -1;
		 }
		int sum=0;
		for(int i=start; i<=end; i++) {
			if(isEven(i)) {
				sum=sum+i;
			}
		}
		//System.out.println("sum of even numbers: "+sum);
		return sum;
	
	
	}
}
