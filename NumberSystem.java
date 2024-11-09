package java_prep;
//base to any decimal
import java.util.Scanner;

public class NumberSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		System.out.println("Enter base value:");
		int b = sc.nextInt();

		int result = getValueInBase(n, b);
		System.out.println("Result = "+result);
		
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

}
