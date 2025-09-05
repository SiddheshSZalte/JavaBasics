package javaRevision;
import java.util.*;

public class Input {
	public static void main (String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a :");
		int a= scn.nextInt();
		System.out.println(a);
		System.out.print("enter a string:");
		String b = scn.next();
		System.out.println(b);
		System.out.print("enter a decimal:");
		float e = scn.nextFloat();
		System.out.println(e);
		System.out.println("enter a boolean value:");
		boolean f = scn.nextBoolean();
		System.out.print(f);
		System.out.println("enter a long value:");
		long l = scn.nextLong();
		System.out.print(l);
		System.out.println("Enter a Double value:");
		double k = scn.nextDouble();
		System.out.println(k);
	}

}
