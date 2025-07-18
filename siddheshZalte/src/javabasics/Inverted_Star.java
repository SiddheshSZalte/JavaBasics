package javabasics;

public class Inverted_Star {
	public static void main(String args[]) {
		int n = 8;
		for (int line = 1; line <=n;line ++) {
			for (int star = 1;star<=n-line+1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

/*
 * dry run = afer observing the pattern the no. of stars in each line are =
 * line(total)-line(no.)+1 now the reason for takiing n in this example is that
 * here line will get every time decremented after each loop is executed
 */