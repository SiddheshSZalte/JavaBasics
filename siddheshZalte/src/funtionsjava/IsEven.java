package funtionsjava;

public class IsEven {
public static boolean isEven(int n) {
	  boolean a = true;
	  if (n%2==1) {
		  a = false;
	  }
	  return a;
}
public static void main(String args[]) {
	int n  = 455678;
	System.out.println(n+" is even :"+isEven(n));
}
}
