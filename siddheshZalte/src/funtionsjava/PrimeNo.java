package funtionsjava;
import java.util.Scanner;
public class PrimeNo {
	public static boolean prime(int n) {
		if (n == 2) {
			System.out.println("true");
		}
		for (int i = 2;i<=n-1;i ++) {
			if (n%i == 0) {
				return false;
				
			}
			
		
		}
		return true;
		
	}
	public static void main(String args[]) {
		int n ;
		Scanner scn = new Scanner (System.in);
		System.out.println("enter the no :");
		n = scn.nextInt();
		System.out.println(prime(n));
	
		
	}
	

}
