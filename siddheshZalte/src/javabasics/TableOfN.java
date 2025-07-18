package javabasics;
import java.util.Scanner;
public class TableOfN {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no . :");
		int n = scn.nextInt();
		for (int i = 1; i<=10;i++) {
			int a = i * n;
			System.out.println(n +"*"+ i + "="+ a);
		}
	}

}
