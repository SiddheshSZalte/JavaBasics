package funtionsjava;

public class AddingAllDigits {
	public static int Addition(int n) {
		int sum = 0;
		while (n>0) {
			int lastDigit = n %10;
                sum = sum + lastDigit;
                n /=10;
		}
		return sum ;
	}
 public static void main(String args[]) {
	  int n = 6546862;
	  System.out.println("Sum of the digits is :"+Addition(n));
 }
}
