package arrays;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int numbers[] = new int[10];
		for (int i = 0 ; i < numbers.length;i ++) {
			System.out.println("enter the value for " +(i+1));
			numbers[i] = scn.nextInt();
		}
		System.out.println("Enter the no. in the array to be found :");
		int key = scn.nextInt();
		int a = 0,index = 0;
		int i ;
		
		
		for( i = 0 ; i < numbers.length; i ++) {
			if (numbers[i] == key) {
				a = 1;
				 index = i;
			}
		}
		if (a==1) {
			System.out.println("the key present at " + index);
		}else {
			System.out.println("its not in the array");
		}
		
	}
}
