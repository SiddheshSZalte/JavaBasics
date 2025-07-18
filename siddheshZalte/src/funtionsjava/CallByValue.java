package funtionsjava;
// it is a code for swapping                               
public class CallByValue {
public static void swap(int a , int b) {
	int c = a;
	a =b;
	b=c;
	System.out.println("a : "+a);
	System.out.println("b : "+b);

	
	
}
public static void main(String args[]) {
	int a = 10;
	int b = 45;
    
	swap( a, b);
}
}
