package javabasics;
import java.util.Scanner;
public class EvenOddAddition {
public static void main(String args[]) {
	Scanner scn = new Scanner(System.in);
	int number;
	int choice;
	int EvenAddition = 0;
	int OddAddition = 0;
	do {
		System.out.println("Enter the no. :");
		number = scn.nextInt();
		if (number%2==0) {
			EvenAddition += number;
		}
		else {
			OddAddition +=number;
		}
		System.out.println("if want to continue enter 0 otherwise any other key");
		choice = scn.nextInt();
	}while(choice == 0);
	
	System.out.println("sum of even numbers is :"+EvenAddition);
	System.out.println("sum of odd numbers is :"+OddAddition);
	
}
}
