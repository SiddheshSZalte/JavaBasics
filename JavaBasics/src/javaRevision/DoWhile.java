package javaRevision;

public class DoWhile {
	public static void main (String args[]) {
		int n =1;
//		do {
//			System.out.println(n);
//			n++;
//		}while (n<=5);
		int number  = 8;
		long fact = 1;
		do {
			fact = fact *n;
			n++;
		}while (n<=number);
		System.out.println("factorial of "+number+" is:" +fact);
	}
}
