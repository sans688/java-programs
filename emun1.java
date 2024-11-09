package string;
//using name()
import java.io.*;
public class emun1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fruits.Orange.name());
		System.out.println(Fruits.Apple.name());
		//System.out.println(Fruits.Banana.name());
		System.out.println(Fruits.Mango.name());
	}
	enum Fruits{
		Orange,
		Apple,
		Banana,
		Mango;
	}

}
