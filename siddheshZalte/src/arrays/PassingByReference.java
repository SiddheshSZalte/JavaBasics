package arrays;
public class PassingByReference {
	public static void update(int marks [],int a ) {
		
		for (int i = 0 ; i < marks.length ; i ++) {
			marks[i] = marks[i] + 1;
		}
		a = 10;	
	// here in the code their are two examples one is pass by value that is for the value of a and then
		// pass by reference for the array being used over there.
		
		
		}
public static void main(String args[]) {
	int marks [] = {9,8,10};
	int a = 5;
	update( marks,a);
	for (int i = 0 ; i < marks.length;i++) {
		System.out.println(" updated marks are = " + marks[i]);
	}
	System.out.print("the value of a is :" + a);
}
}
