package javabasics;

public class HalfPyramid {
public static void main(String args[]) {
	int n = 6;
	for (int line = 1 ; line<= n;line ++) {
		for (int number = 1 ; number <= line; number++) {
			System.out.print(" "+number);
			}
		System.out.println();
		
	}
}
}
/*
 * DRY RUN = in this code for pyramid pattern the no. of rows for the pattern
 * should define the no. of time the outer loop should run and then the elements
 * in the maximum row define the no. of time the inner loop will run
 * 
 */