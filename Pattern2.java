package pattern;
/*
inverted right triangle

*****
****
***
***
*

 */
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=4;i++) {
			//descrease no. of stars
			for(int j =4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
