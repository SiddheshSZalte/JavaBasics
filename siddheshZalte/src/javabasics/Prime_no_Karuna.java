package javabasics;
import java.util.*;
public class Prime_no_Karuna {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. :");
		int a = scn.nextInt();
		
		if (a == 2) {
			System.out.print(" Prime");
		}else {
	
	boolean isprime = true;
	for (int i = 2;i <=a-1;i++) {
		if (a % i == 0) {
			isprime = false;
		}
	}
	if (isprime == true) {
		System.out.print("prime");
	}
	else {
		System.out.print("not prime");
	}
	}
}
}
