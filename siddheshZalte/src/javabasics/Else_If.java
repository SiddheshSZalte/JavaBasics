package javabasics;
import java.util.Scanner;


public class Else_If {
public static void main (String args[]) {
	Scanner scn = new Scanner(System.in);
	float number = scn.nextFloat();
	if (number%2==0) {
		System.out.print("even");
	}else if(number % 2 ==1) {
		System.out.print("odd");
	}else {
		System.out.print("not valid");
	}
		}
}
