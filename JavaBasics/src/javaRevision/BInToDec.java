package javaRevision;

import java.util.Scanner;
public class BInToDec {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number:");
		int Bin_Num = sc.nextInt();
		int ans = 0;
		int parity;
		int power = 1;// this will be values of power of 2
        while(Bin_Num>0) {
              parity = Bin_Num%10;
        	ans = ans + parity*power;
        	Bin_Num /=10;
        	power=power*2;
        }
        System.out.println(ans);
	}

}
