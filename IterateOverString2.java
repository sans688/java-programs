package string;
//iterate over string using CharacterIterator and StringCharacterIterator
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Scanner;
public class IterateOverString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.nextLine();
		getChar(s);
	}
	public static void getChar(String s) {
		CharacterIterator itr = new StringCharacterIterator(s);
		while(itr.current()!=CharacterIterator.DONE) {
			System.out.print(itr.current()+" ");
			itr.next();
		}
				
	}

}
