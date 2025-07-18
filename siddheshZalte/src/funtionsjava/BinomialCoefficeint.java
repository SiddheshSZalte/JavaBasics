package funtionsjava;
import java.util.Scanner;

public class BinomialCoefficeint {
	public static int factorial(int a) {
		int fact = 1;
		for(int i = 1; i <= a;i++) {
			fact = fact*i;
		}
		return fact;
		
	}
	
	public static int binomialCoefficient(int n,int r) {
		int a = factorial(n);
		int b = factorial (r);
		int c = factorial (n-r);
		int binoCoef = a/(b*c);
		return binoCoef;
	}
	
	public static void main(String args[]) {
		  Scanner scn = new Scanner (System.in);
		  System.out.println("Enter values for n and r =:"); 
		  int n = scn.nextInt();
		  int r = scn.nextInt();
		 System.out.println("Binomial Coefficient for n and r is :" +binomialCoefficient(n,r));
	}

}
