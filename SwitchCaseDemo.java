package com_edu;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------Menu--------------------------");
		System.out.println("a");
		System.out.println("e");
		System.out.println("i");
		System.out.println("o");
		System.out.println("u");
		
		System.out.println("Make your choice:");
		ch= sc.next().charAt(0);
		switch(ch) {
		case 'a':
			System.out.println("A for Apple");
		break;
		case 'e':
			System.out.println("E for Elephant");
		break;
		case 'i':
			System.out.println("I for Icecream");
		break;
		case 'o':
			System.out.println("O for Orange");
		break;
		case 'u':
			System.out.println("U for Umbrella");
		break;
		default:
			System.out.println("Invalid case");
			break;
		}
	}

}
