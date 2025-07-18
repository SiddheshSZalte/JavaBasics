package javabasics;

import java.util.Scanner;
public class Income_tax {
 public static void main(String args[] ) {
	 Scanner scn = new Scanner(System.in);
	 System.out.print("Enter the income:");
	 int income = scn.nextInt();
	 double tax;
	 
	 if (income < 500000) {
		 tax = 0;
		 
	 }
	 else if (income >=500000 && income <= 1000000) {
		 tax = income * 0.2;
		
	 }
	 else {
		 tax = income * 0.3;
		 
	 }
	 
	 System.out.print("Your Tax to be paid :" + tax);
 }
}
