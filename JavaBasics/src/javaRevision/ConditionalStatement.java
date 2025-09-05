package javaRevision;
import java.util.*;

public class ConditionalStatement {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		//Else IF conditional Statement
     	System.out.println("Enter a number:");
		int a = sc.nextInt();
		if (a%2==0) {
			System.out.println("Number is even");
		}
		else if(a%2==1) {
			System.out.println("number is odd");
		}
		else {
			System.out.println("cannot define");
		}
	         boolean b = a%2 == 0;
		//Switch Case Conditional Statement
		switch(b?1:0){
		case 1:System.out.println("it is even");
		break;
		case 0 : System.out.println("it is odd");
		break;
		default:System.out.println("not define");
		
		}
            
		
	}
}
