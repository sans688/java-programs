package java_prep;

import java.util.Scanner;

public class AddingMatrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter Number of rows:");
		int cols = sc.nextInt();
		int[][] mat1 = new int [rows][cols];
		int[][] mat2 = new int [rows][cols];
		int[][] result = new int [rows][cols];
		
		//taking input of first matrix 
		System.out.println("Enter elements for matrix 1: ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				mat1[i][j]= sc.nextInt();
			}
		}
		//taking input of second matrix 
		System.out.println("Enter elements for matrix 2: ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				mat2[i][j]= sc.nextInt();
			}
		}
		
		//for adding two matrix
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				result[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		System.out.println("First matrix: ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Second matrix: ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println();
		}
		
		//for displaying matrix's result
		System.out.println("Addition of two matrix: ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
