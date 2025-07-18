package javabasics;

public class TernaryOperator {
	public static void main(String args[]) {
			
	String type = (5%2==0)?"even":"odd";
	System.out.println(type);	
	
	int a = 150;
	boolean year =(a % 4 == 0)?true:false;
	System.out.println(year);
	
	boolean b  = (150 % 2 == 0)?true : false;
	System.out.print(b);
	}

}
