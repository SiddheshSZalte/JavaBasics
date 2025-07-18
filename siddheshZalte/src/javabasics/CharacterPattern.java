package javabasics;

public class CharacterPattern {
public static void main(String args[]) {
	char ch = 'A';
	for(int i = 1; i <=4;i++) {
		for (int n=1;n<=i;n++) {
			
			System.out.print(ch);
			ch++;
			
		}
		
		System.out.println();
			
	}
  }
}
/*
 * DRY RUN = the problem faced was about the position of char ch i.e it was
 * inside the loop and hence every time it was taking it again ch as A only and
 * hence the output was always A only so increasing the scope of variable ch
 * solved the problem
 */