package javabasics;
import java.util.Scanner;
public class factorial {
	public static void main(String args[]) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter no. :");
		int n =scn.nextInt();
		
		int fact = 1;
		for (int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
