package funtionsjava;
import java.util.Scanner;
public class Factorial {
public static int factorial (int n ) {
	int fact =1;
	for (int i = 1; i <=n; i++) {
		fact = fact * i ;
	}
	return fact;
}

public static void main(String args[]) {
	Scanner scn = new Scanner(System.in);
	System.out.println ("Enter no.=:");
	int n = scn.nextInt();
	int fact = factorial (n);
	System.out.println("Factorial is =:"+fact);
	System.out.println("factorial of 5 is =:" + factorial(3));
}
}
