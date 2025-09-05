package javaRevision;
import java.util.*;
public class TerniaryOperator {
	public static void  main (String args[]) {
		int c = 2;
		int b = 5;
		
        boolean a = (b/c==b-c)?true :false;
        System.out.println(a+" is answer for "+c+","+b);
        
        
        String type = b%2 == 0? "Even":"Odd";
        System.out.println(type);
	}

}
