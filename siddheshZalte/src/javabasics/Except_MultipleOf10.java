package javabasics;

import java.util.Scanner;

public class Except_MultipleOf10 {
  public static void main(String args[]) {
	  Scanner scn = new Scanner(System.in);
	  int n = 0;
	  do {
		  System.out.println("Enter the no. : ");
		  int a  = scn.nextInt();
		  if (a % 10 == 0) {
			  continue;
		  }
		  System.out.println(a);
	  }while(n ==0);
  }
}
