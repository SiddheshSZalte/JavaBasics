package javabasics;

import java.util.Scanner;

public class Switch_Calculator {
  public static void main(String args[]) {
	 Scanner scn = new Scanner(System.in);
	 System.out.println("enter first no. : ");
	 System.out.println("enter second no. : ");
	 int a = scn.nextInt();
	 int b = scn.nextInt();
	 System.out.print("Enter code for operation: ");
	 char ch = scn.next().charAt(0);
	 
	 switch(ch) {
	 case '+':System.out.print("Addition :"+(a+b));
	 break;
	 case '-':System.out.print("subtration :"+(a-b));
	 break;
	 case '*':System.out.print("multiplication :"+(a*b));
	 break;
	 case '/':System.out.print("division :"+(a/b));
	 break;
	 }
	 
 }
}
