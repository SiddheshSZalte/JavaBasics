package javaRevision;
import java.util.*;

public class PrimeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		int  isprime = 1;
		for(int i = 2; i<=(a/2);i++){
			if (a%i == 0) {
				isprime = 0;
			}
			
		}
		switch(isprime) {
		case 0 : System.out.println("not prime");
		break;
		case 1 : System.out.println("Prime");
		}
	}

}
