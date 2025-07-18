package funtionsjava;

public class PrimeInRange {
	public static boolean prime(int i ) {
		if (i == 2) {
			return true ;
		}
		for (int j = 2;j <= Math.sqrt(i);j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
	public static void primeInRange(int n ) {
		for (int i = 2; i <= n;i ++) {
			boolean a = prime (i);
			if (a == true) {
				System.out.print(" "+i);
			}
		
		}
	}
	public static void main(String args[]) {
		primeInRange(100);
	}



	
}