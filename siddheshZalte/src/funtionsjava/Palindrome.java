package funtionsjava;

public class Palindrome {
public static int isPalindrome(int n ) {
	int revNum = 0;
	for (int i = n ; i >0; i/=10) {
		int lastdigit = i%10;
		 revNum = revNum*10 + lastdigit;

	}
	return revNum;
	}
	
public static void main(String args[]) {
	int n = 123454321;
	int revNum = isPalindrome(n);
	if (n== revNum) {
		System.out.println("the number is palindrome");
	}
	else {
		System.out.println("the number is not palindrome");
	}
}

}
