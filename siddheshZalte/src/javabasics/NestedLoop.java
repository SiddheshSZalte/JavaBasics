package javabasics;

public class NestedLoop {
	public static void main(String args[]) {
		
		  for (int line = 1;line <=4;line++) { 
			  for (int star = 1; star<=line;star++)
			  {
		         System.out.print("*"); 
		  }
			  System.out.println(); }
		 
	}
	
}


/*
 * dry run = for line = 1, the inner loop will start running as star = line the
 * inner statement will be executed and "*" will get printed and now the inner
 * loop will increament star to 2 and as now star is not <= line the inner loop
 * will be exited and the println statement will be executed and now line will
 * be incremented to 2 and as now the inner loop will again start executing from
 * start that is for star=1 it will print "*" and now will increment star = 2
 * which will again satisfy the condition hence will again print "*" near to the
 * first star only as the loop has not yet been exited to excute the println
 * statement
 * 
 * 
 * 
 * 
 * INVERTED STAR PATTERN
 * 
 */
 
    	   
    	   
    	   
    	   
	
	

