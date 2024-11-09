package java_prep;

import java.util.Scanner;

/*Write a method called inputThenPrintSumAndAverage that does not have any parameters.  

The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.  

When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".  

XX represents the sum of all entered numbers of type int.

YY represents the calculated average of all numbers of type long.  

EXAMPLES OF INPUT/OUTPUT:  

EXAMPLE 1:  

INPUT:   1 2 3 4 5 a  

OUTPUT   SUM = 15 AVG = 3  

EXAMPLE 2:  

INPUT:   hello  

OUTPUT:   SUM = 0 AVG = 0*/
public class InputCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputThenPrintSumAndAverage();
	}
	public static void inputThenPrintSumAndAverage() {
		int sum=0, count=0;
		double avg=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		while(true) {
			boolean isInt = sc.hasNextInt();//hasNextInt checks the next input is an integer or not
			if(isInt) {
				int value = sc.nextInt();
				sum+=value;
				count ++;
			}
			else if(count == 0) {
				System.out.println ("SUM = 0 AVG = 0");
	            break;
			}
			else {
				avg = sum/count;
				System.out.println("Sum = "+sum+" "+"Average ="+avg);
				break;
			}
			sc.nextLine();
		}
		sc.close();
	}

}
