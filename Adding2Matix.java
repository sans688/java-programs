package java_prep;

import java.util.Scanner;

public class Adding2Matix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = {{1,2,3},
						{4,5,6}};
		int[][] arr2 = {{1,2,3},
						{4,5,6}};
		int[][] result= {{0,0,0},
						{0,0,0}};
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3;j++) {
				result[i][j]= arr1[i][j] + arr2[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		/*for(int i=0; i<arr1.length-1; i++) {
			for(int j=0; j<arr1[i].length;j++) {
				System.out.print(result[i][j]+" ");
				
				
			}
			System.out.println();
		}
		*/
		
	}

}
