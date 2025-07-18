package javabasics;

import java.util.Scanner;

public class Leap_Year {
 public static void main(String args[]) {
	 Scanner scn = new Scanner(System.in);
	 System.out.println("enter the year:");
	 int a = scn.nextInt();
	 boolean x = (a % 4) == 0;
	 boolean y = ! ((a % 100) == 0);
	 boolean z = ((a % 100 == 0) && (a % 400 == 0));
	 
	 if (x && (y||z)) {
		 System.out.println(a + " is a leap year");
	 }
	 else {
		 System.out.println(a + " is not a leap year");
	 }
  }
}
