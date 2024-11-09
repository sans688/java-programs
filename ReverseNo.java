package com_edu;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int reverse=0;
		while(num>0) {
			int temp = num % 10;
			reverse = reverse*10+ temp;
			num=num/10;
		}System.out.println(reverse);
	}

}
