package string;

public class ConvertStringtoArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sanskriti";
		char[] ch = new char[str.length()];
		for(int i=0; i<str.length();i++) {
			ch[i]= str.charAt(i);
		}
		System.out.print("[");
		for(char c : ch) {
			
			System.out.print(c+", ");
		}
		System.out.print("]");
	}

}
