package string;
//Using CharArray one word into letters
public class ConvertStringtoArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sanskriti";
		char[] ch = str.toCharArray();
		
		System.out.print("[");
		for(char c : ch) {
			
			System.out.print(c+", ");
		}
		System.out.print("]");
	}
	

}
