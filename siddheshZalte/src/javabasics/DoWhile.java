package javabasics;

public class DoWhile {
 public static void main(String args[]) {
	 int n=0;
	 do {
		 System.out.println("lets do DOWHILE");
		 n++;
	 }while(n<=4);
	 int  x = 5678;
	 int reverse = 0;
	 int lastdigit;
	 do {
		 lastdigit = x%10;
		 reverse = reverse*10+lastdigit;
		 x /=10;
	 }while(x>0);
	 System.out.print(reverse);
 }
}
