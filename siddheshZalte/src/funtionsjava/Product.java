package funtionsjava;
import java.util.Scanner;
public class Product {
 public static double product(float a , float b) {
	 double c = a*b;
	 return c;
 } 
  
 public static void main(String args[]) {
	 Scanner scn = new Scanner(System.in);
	 System.out.println("Enter the values of a & b :");
	 int a = scn.nextInt();
	 int b = scn.nextInt();
	 double product = product(a,b);
	 System.out.println(product);
	 product = product(10,12);
	 System.out.println(product);
 }
}
