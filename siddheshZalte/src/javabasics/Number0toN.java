package javabasics;

import java.util.Scanner;

public class Number0toN {
	public static void main(String args[]) {
		System.out.println("enter the no. n : ");
		
		Scanner scn = new Scanner(System.in);
		int  n= scn.nextInt();
		int a = 0;
		while(a<=n) {
			System.out.print(a+" ");
			a++;
		}
    }

	
}
