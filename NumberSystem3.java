package java_prep;

import java.util.Scanner;

/*given number n,
 * given base 1  convert it to base2
*/
public class NumberSystem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		System.out.println("Enter base value:");
		int b1 = sc.nextInt();
		System.out.println("Enter base value:");
		int b2 = sc.nextInt();

		int result = getValue(n, b1,b2);
		System.out.println("Result = "+result);
	}
	//first convert value to decimal and then convert it to desire base 
	private static int getValue(int n, int b1, int b2) {
		// TODO Auto-generated method stub
		int dec = getValueInDecimal(n, b1);
		int dn = getValueInBase(dec, b2);
		return dn;
	}
	
	public static int getValueInBase(int n, int b){
		int rv=0, p=1; //here p is power
	
		while(n>0) {
			int dig = n%b;
			n=n/b;
			rv= rv+dig *p;
			p *=10;
		}
		return rv;
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
