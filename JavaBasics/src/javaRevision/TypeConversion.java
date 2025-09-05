package javaRevision;
import java.util.*;

public class TypeConversion {
	
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a long Value:");
		double  a = sc.nextLong();
		System.out.println(a);
		
		System.out.println("enter a INT Value:");
		float b = sc.nextInt();
		System.out.println(b);
		
		System.out.println("enter a long value:");
		float  c = sc.nextLong();
		System.out.println(c);
		//size of Destination type > size source Type 
		//byte=>short=>int=>long=>float=>double
		// if tried doing in reverse order then leads to lossy 
		//conversions and the IDE may not allow it 
		
	}
	

}
