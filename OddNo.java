package java_prep;

public class OddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		while(i<=30) {
			
			if(!isOdd(i)) {
				continue;
			}
			 
			
		}
	}
	public static boolean isOdd(int num) {
		if(num%2==0) {
			return false;
		}
		else {
			System.out.println(num);
			return true;
			
		}
	}
}
