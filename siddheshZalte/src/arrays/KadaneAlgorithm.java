package arrays;
// the code will not work for a array which contains all negative values 
public class KadaneAlgorithm {
	public static void maxSum(int numbers[]) {
	int currSum = 0;
	int maxSum  = 0;
	for (int i = 0; i < numbers.length; i ++) {
		currSum = currSum + numbers[i];
		if (currSum < 0) {
			currSum = 0;
			
		}
				
		if (maxSum < currSum ) {
			maxSum  = currSum;
		}
		
		
		System.out.println("maxsum is :" +maxSum);
		
		
		
		
		System.out.println("currsum is :" +currSum);
	}
}
	public static void main(String args[]) {
		int number[] = { -2 , -3 , 4 , -1 , -2 , 1 , 5 , -3};
		maxSum(number);
	}
	

}
