package arrays;

public class MaxSumPrefix {
	public static void maxSum(int numbers[]) {
		int prefix[] = new int [numbers.length];
		int sum = 0 ;
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0; i < numbers.length;i ++) {
			prefix[i] = numbers[i] + sum ;
			sum += numbers[i];
			}
		for(int i=0; i < numbers.length;i++) {
			
			for (int j = i; j < numbers.length; j ++) {
				currSum = i == 0? prefix [j] : prefix[j] - prefix[i - 1];
				
			}
			if (maxSum < currSum ) {
				maxSum = currSum ;
			}
			
		}System.out.println(maxSum);
	}
		public static void main(String args[]) {
			int numbers[] = {2,-4,6,-8,10};
			
			maxSum(numbers);
		}
}

