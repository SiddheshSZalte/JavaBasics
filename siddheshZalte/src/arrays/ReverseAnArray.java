package arrays;

public class ReverseAnArray {
	public static void reverseArray(int numbers[]) {
		int first = 0,last = numbers.length - 1;
		while(first<last) {
			int temp = numbers[last];
			numbers[last] = numbers[first];
			numbers [first] = temp;
			first = first + 1;
			last = last -1;
		}
		for (int i = 0 ; i < numbers.length;i ++) {
		System.out.print( numbers[i] + " ");
		}
	}



public static void main(String args[]) {
	int numbers[] = {1,2,3,45};
	reverseArray(numbers);
	
}	
}
