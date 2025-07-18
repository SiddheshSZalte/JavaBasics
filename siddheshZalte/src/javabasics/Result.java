//Using Ternary Operator


package javabasics;

import java.util.Scanner;

public class Result {
     public static void main(String args[]) {
    	 Scanner sc = new Scanner(System.in);
	     int percentage;
	     System.out.println("Percentage:");
	     percentage = sc.nextInt();
	     boolean a = (8>5)?true:false;
	     System.out.println(a);
	     String result = (percentage>=33)?"pass":"fail";
	     System.out.println("Result is :"+result);
   }
}
