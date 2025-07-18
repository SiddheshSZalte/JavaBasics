package funtionsjava;
import java.util.*;
public class functionWithParameter {
public static int calculateSum(int a , int b) {
	int sum = a+b ;
	return sum;
}

public static void main(String args[]) {
	Scanner scn = new Scanner(System.in);
	
	
	System.out.println("enter a and b :");
	
	int a = scn.nextInt();
	int b = scn.nextInt();
	int Addition = calculateSum(a,b);
	System.out.println(Addition);
}
}
