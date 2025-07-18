package funtionsjava;

public class OverloadingPara {
	public static int multiply(int a, int b ) {
		return a*b;
	}
	public static int multiply(int a , int b, int c) {
		return a*b*c;
		}
	

public static void main(String args[]) {
	System.out.println(multiply(4,5));
	System.out.println(multiply (2,4,6));
	
	
}
}