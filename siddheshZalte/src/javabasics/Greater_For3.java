package javabasics;
import java.util.Scanner;

public class Greater_For3 {
public static void main(String args[]) {
	 int a = 5 , b= 5,c = 5;
	

	 
	  if((a>b) && (a>c)) {
		 System.out.print("Greatest no. is a");
	 }
	 else if (b>c) {
		 System.out.print("Greatest no. is b");
	 }
	 else if ((a == b)&&(b == c)) {
			 System.out.print("they are same");
	 }
	 else  {
		 System.out.print("Greatest no. is c");
	 }
	 
	 
  }
}
