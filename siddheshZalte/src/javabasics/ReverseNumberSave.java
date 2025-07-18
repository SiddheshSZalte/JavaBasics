package javabasics;

public class ReverseNumberSave {
	public static void main(String args[] ) {
		
		
		/*int n = 123456;
		int lastDigit;
		int reverse = 0;
		while (n>0) {
		lastDigit = n % 10;
		reverse = (reverse*10 )+lastDigit;
		n/=10;
		 
		}*/
	    int	reverse = 0;
	    int n,lastdigit;
	    
	    
	    for (n=89063;n>0;n/=10) {
	    	lastdigit = n % 10;
	    	reverse = reverse*10 + lastdigit;
	    }
		
		System.out.print(reverse);
		 
	}


}
