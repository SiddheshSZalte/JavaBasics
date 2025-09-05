package javaRevision;
import java.util.*;

public class TypeCasting {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = (int)675.99f;
		System.out.println(a);
		float b = (float)'a';
		System.out.println(b);
		System.out.println("print a double:");
		double c = sc.nextDouble();
		int d = (int)c;
		System.out.println(d);
		System.out.println("Enter a char :");
		char e = sc.next().charAt(0);
		int f = (int )e;
		System.out.println(f);
		char g = (char)a;
		System.out.println(g);
	
	
	}

}
