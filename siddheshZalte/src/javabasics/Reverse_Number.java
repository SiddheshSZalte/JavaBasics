package javabasics;

public class Reverse_Number {
	public static void main(String args[]) {
		int n,a ;
		for (n=7104;n>0;n/=10) {
	     a=n%10;
	     System.out.print(a);
		}
		
		
		System.out.println("------------------------------------------");
		 int x =958493;
		while(x>0) {
			int y = x % 10;
			System.out.print(y);
			x/=10;
		}
	}

}
