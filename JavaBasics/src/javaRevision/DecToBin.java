package javaRevision;
import java.util.*;
public class DecToBin {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		int Dec_Num = sc.nextInt();
		int ans = 0;
		int parity;
		int power = 1;// this will be values of power of 10
        while(Dec_Num>0) {
              parity = Dec_Num%2;
        	ans = ans + parity*power;
        	Dec_Num /=2;
        	power=power*10;
        }
        System.out.println(ans);
	}

}
