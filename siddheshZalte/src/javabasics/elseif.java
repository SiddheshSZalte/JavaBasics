package javabasics;

import java.util.Scanner;

public class elseif {
	public static void main(String args[]) {
		Scanner scn = new Scanner (System.in);
		System.out.println("enter the age:");
		int age= scn.nextInt();
		if (age>=18) {
			System.out.print("Adult");
				if((age<18) && (age >=12)) {
			System.out.print("teenager");
		}
	
	else {
		System.out.print("let it be he is just a baby");
		
	 }
		}
	}
}
