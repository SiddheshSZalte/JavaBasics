package javabasics;
import java.util.Scanner;
public class PracticeQuestionLoops {
	public static void main(String args[]) {
		
		  for(int i = 0; i <5;i++) { System.out.println("hello"); i+=2; }
		
		Scanner scn = new Scanner(System.in);
		int i ;
		for ( i = 0; i <= 5; i ++) {
			System.out.println("i in loop "+ i);
		}
		System.out.println("i out loop "+ i);
	
	}

}
