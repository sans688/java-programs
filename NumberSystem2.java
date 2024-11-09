package java_prep;
//convert number n into decimal value.
import java.util.Scanner;

public class NumberSystem2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		System.out.println("Enter base value:");
		int b = sc.nextInt();

		int result = getValueInDecimal(n, b);
		System.out.println("Result = "+result);
		
	}
	public static int getValueInDecimal(int n, int b){
		int rv=0, p=1; //here p is power
	
		while(n>0) {
			int dig = n%10;
			n=n/10;
			rv= rv+dig *p;
			p *=b;
		}
		return rv;
	}
}
