package string;

public class IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =20;
		//using Integer.toString
		String s = Integer.toString(i);
		System.out.println(s);
		
		//using String.Format
		String s2 = String.format("%d",i);
		System.out.println(s2);
		
		//using String.valueOf()
		String s3 = String.valueOf(i);
		System.out.println(s3);
	}

}
