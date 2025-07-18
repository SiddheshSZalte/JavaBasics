package funtionsjava;

public class BinaryToDec {
	public static void binToDec(int n ) {
		int pow  = 0;
		int dec = 0;
		for ( int i = n ; i > 0;i/=10 ) {
			int LD = i%10;
			dec = dec + LD*(int)Math.pow(2, pow);
			pow ++;
		}
		System.out.println(dec);
		
	}
 public static void main(String args[]) {
	 binToDec(111);
 }
}
