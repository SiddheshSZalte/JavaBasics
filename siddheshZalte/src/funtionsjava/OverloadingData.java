package funtionsjava;

public class OverloadingData {
	public static int add(int a,int b) {
		return a+b;
	}
public static float add(float a , float b) {
	    return a+b;
}
public static void main(String args[]) {
	System.out.println(add(3,6)+" "+add(7.6f,8.1f));
}
}
// here the countr