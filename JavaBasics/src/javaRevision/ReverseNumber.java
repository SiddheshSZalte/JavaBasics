package javaRevision;
import java.util.*;

public class ReverseNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		int lastnum ;
		int revnum = 0;
		while (number > 0) {
			lastnum = number%10;
			revnum = revnum*10 + lastnum;
			number/=10;
			System.out.println("Inside Loop :"+revnum);
		}
		System.out.println("Complete Reverse number:"+revnum);
	} 
}
