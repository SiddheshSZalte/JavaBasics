package javabasics;

import java.util.Scanner;

public class DaysOfWeek {
  public static void main(String args[]) {
	  Scanner scn = new Scanner(System.in);
	  System.out.println("enter the no.of day:");
	  int day = scn.nextInt();
	  switch(day) {
	  case 1 : System.out.print("Monday");
	  break;
	  case 2 : System.out.print("Tuesday");
	  break;
	  case 3 : System.out.print("Wednesday");
	  break;
	  case 4 : System.out.print("Thursday");
	  break;
	  case 5 : System.out.print("Friday");
	  break;
	  case 6: System.out.print("Saturday");
	  break;
	  case 7: System.out.print("Sunday");
	  break;
	  default: System.out.print("do a valid entry");

	  
	  }
  }
}
