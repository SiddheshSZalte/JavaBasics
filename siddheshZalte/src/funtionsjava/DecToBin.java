package funtionsjava;

public class DecToBin {
	public static void decToBin(int n) {
		/*
		 * for(int i = n;i>0;i/=2) { int a = i %2; System.out.print(a);
		 * 
		 * }
		 */

		int pow = 0;
		int binNum = 0;
		while (n >0) {
			int rem = n %2;
			binNum = binNum + rem *(int)Math.pow(10,pow);
			pow ++; 
			n /=2;
		}
		System.out.println(binNum);;
	}
	public static void main(String args[]) {
		int n= 7;
		decToBin(n);
	}

}
