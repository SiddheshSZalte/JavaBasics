package arrays;
import java.util.Scanner;
public class ArrayBasics {
	public static void main(String args[] ) {
		
		Scanner scn = new Scanner (System.in);
		/*
		 * int numbers[]= new int[50]; int marks[]= {1,2,3,4,5,6,7,8,9,10}; char
		 * characters[] = new char[5]; char charac[] = {'a','b','c','d','e'}; String
		 * array[] = new String[3]; String arr[] =
		 * {"siddhesh","Pranav","aditya","karuna"};
		 * 
		 * numbers[0]= 7;
		 */
		System.out.println("enter marks = ");
		int marks [] = new int [3];
		marks [0] = scn.nextInt();
		marks [1] = scn.nextInt();
		marks [2] = scn.nextInt();
		int length = marks.length;
		System.out.println("Marks in physics =  " + marks[2]);
		System.out.println("Marks in physics =  " + marks[1]);
		System.out.println("Marks in physics =  " + marks[0]);
		
		System.out.println("Marks in physics =  " + length);
			/*
			 * System.out.println("number is " + numbers[0]); array[2] = scn.next();
			 * System.out.println("String is  " + array[2]); array [2] = "aditya";
			 * System.out.println("String is  " + array[2]); numbers[0] = numbers[0] + 2;
			 * System.out.println("number is " + numbers[0]);
			 */
		 
		
		}

}
