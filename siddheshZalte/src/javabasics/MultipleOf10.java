package javabasics;

import java.util.Scanner;

public class MultipleOf10 {
public static void main(String args[]) {
	Scanner scn = new Scanner(System.in);
	
     while (true) {
		System.out.println("Enter No. a :");
		int a = scn.nextInt();
		if (a%10==0) {
			break;
		}
		System.out.println(a);
     }
		int f = 1;
		do {
		  System.out.print("enter the no. n : ");
		  int n = scn.nextInt();
		  if(n%10  == 0) {
			  break; 
		  }
		  System.out.print(n);
		}while(f<=1);
			
		
		
}
}
