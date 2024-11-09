package java_prep;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		switch(Character.toLowerCase(ch)) {
			case 'a':
				System.out.print("Letter is vowel "+ch);	
				break;
			case 'e':
				System.out.println("Letter is vowel "+ch);
				break;
			case 'i':
				System.out.println("Letter is vowel "+ch);
				break;
			case 'o':
				System.out.println("Letter is vowel "+ch);
				break;
			case 'u':
				System.out.println("Letter is vowel "+ch);
				break;
			default:
				System.out.println("Letter is not vowel "+ch);
				break;
		}
		
	}

}
