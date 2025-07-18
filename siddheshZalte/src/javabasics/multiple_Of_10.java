package javabasics;
import java.util.Scanner;
public class multiple_Of_10 {
public static void main(String args[]){
	Scanner scn = new Scanner(System.in);
	
	for (;; ) {
		System.out.print("enter the no. :");
		int a = scn.nextInt();
		if (a % 2 == 0) {
			break;
		}
		System.out.print(a);
	}
	
}
}
