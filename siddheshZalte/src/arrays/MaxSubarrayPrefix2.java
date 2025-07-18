package arrays;

public class MaxSubarrayPrefix2 {
	public static void maxSubarrayPre(int numbers[]) {
		int prefix[] = new int [5];
		int sum = 0;
		for (int i = 0 ; i < numbers.length; i ++) {
			prefix[i] = numbers[i] + sum;
			sum += numbers[i];
		}
	for (int i = 0 ; i < prefix.length;i ++) {
		System.out.print(prefix[i] + " ");
		
	}
	}
public static void main (String args[]) {
	int numbers[] = { 2,4,6,8,10};
	maxSubarrayPre(numbers);
}
}
