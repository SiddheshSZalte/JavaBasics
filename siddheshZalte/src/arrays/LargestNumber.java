package arrays;
import java.util.*;
public class LargestNumber {
	public static int getNumber(int numbers[]) {
		int largest = Integer.MAX_VALUE;
		for(int i = 0; i < numbers.length;i ++) {
			if (largest>numbers[i]) {
				largest = numbers[i];
			}
		}
		return largest;
	}
	
	
	public static void main(String args[]) {
		int numbers [] = {1,5,8,980,-45,454,3984};
		int largest = getNumber(numbers);
		System.out.println("largest number is : " + largest);
	}

}
