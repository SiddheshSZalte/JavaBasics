package arrays;
import java.util.*;
// can be used in sorted Arrays only and help in reducing time complexity
public class BinarySearch {
	public static int BinarySearch(int numbers[], int key) {
		int n = numbers.length;
		int start = 0, end = n-1;
		while(start <= end ) {
			int mid = (start + end)/2;
			if (key == numbers[mid] ) {
				return mid;
				}
			if (numbers[mid] < key) {
				start = mid + 1;
			}
			if (numbers[mid] > key) {
				end = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Scanner scn = new Scanner(System.in);
		System.out.print("enter the number : ");
		int key = scn.nextInt();
		
		System.out.println("key is at the index : " + BinarySearch(numbers,key));
	}
	}
