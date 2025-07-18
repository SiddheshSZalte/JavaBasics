
package javabasics;
import java.util.Scanner;


public class Add_N_number {
	public static void main(String args[] ) {
		Scanner scn = new Scanner (System.in);
		System.out.println("enter number :");
		int n = scn.nextInt();
		int i =1;
		
		int sum = 0;
		 while(i<=n) {
			 sum += i;
			 i++;
			 System.out.println(sum + "  " +i);
		 }
		 

		
	}

}
