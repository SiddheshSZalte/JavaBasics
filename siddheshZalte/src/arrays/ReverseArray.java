package arrays;

public class ReverseArray{
	public static void reverseArray(int numbers[]) {
		int reverse[] = new int [numbers.length];
		
		for (int i = numbers.length-1; i >= 0; i --) {
			System.out.print(numbers[i]+" ");
		}
		
	}
	public static void main(String args[]) {
		int numbers[] = {2,4,6,8,10};
		reverseArray(numbers);
	}
}
