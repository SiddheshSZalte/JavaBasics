package arrays;
// their is one problem with this code for calculating the maximum sum is that we have to use 3 nested loops
//over here which leads to increase in the time complexity for this code and thats why there is need of some other 
// solution which could reduce the time complexity here time complexity is O(n^3).
public class MaxSubarraysSumBrute {
	public static void subarrayMaxSum(int numbers[]) {
		int maxSum = Integer.MIN_VALUE;   
		int currSum = 0;
		for (int i = 0 ; i < numbers.length ; i ++) {
			
			for (int j = i ; j < numbers.length; j ++) {
				currSum= 0;
				for (int k = i ; k <= j; k ++) {
					
					currSum += numbers[k];
				}
				System.out.println("sum is : " + currSum);
				if (currSum >maxSum ) {
					maxSum = currSum;
				}
			}
		}
		System.out.println("the maximum sum is : " + maxSum);
	}
public static void main(String args[]) {
	int numbers [] = { 2,4,6,8,10};
	subarrayMaxSum(numbers);
}
}
