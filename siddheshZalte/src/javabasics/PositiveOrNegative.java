package javabasics;

import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String args[]) {
		
	  Scanner scn = new Scanner (System.in);
	  
		System.out.println("Enter the no : ");
		int  a = scn.nextInt();
		if (a>=0) {
			System.out.println("positive");
		}
		else {
			System.out.println("Negative");
		}
	}

}
