package java_prep;



public class DigitFrequency1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 987999912;
		int d,count=0;
		while(num>0) {
			d = num%10;
			if(d==9) {
				count ++;
			}
			num = num/10;
		}
		System.out.println(count);
	}
	

}
