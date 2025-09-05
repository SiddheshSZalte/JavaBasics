package javaRevision;
import java.util.*;

public class Break {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if(a %10==0) {
			System.out.println("not printing number");
			continue;
		}
		System.out.println(a);
	}
}

}
