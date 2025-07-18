package sorting;

public class BubbleSort {
	public static void bubbleSort(int numbers[]) {
		int n= numbers.length;
		for(int i = 0 ; i < n - 1;i ++) {
			for(int j = 0; j < n-i-1; j ++) {
				if(numbers[j]>numbers[j + 1]) {
					int x =  numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = x;
				}
			}
		}
		
		for(int i = 0; i < n; i ++) {
			System.out.print(numbers[i] + " ");
		}
		
	}

	public static void main (String args[]) {
		int numbers[] = { 5,1,7,10,4,1,5,8};
		bubbleSort(numbers);
		
	}
		
	}
