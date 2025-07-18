package javabasics;

public class OperatorPractice {
	public static void main(String args[]) {
  /*float a = 2;
  float b = 5 ;
  float exp1 = (a*b/a);
  float exp2 = (a*(b/a));
  System.out.print(exp1 +",");
 	
   System.out.print(exp2);
int x,y,z;
x = y = z = 2;
x +=y;
y -=z;
z/=(x +y);
System.out.print(x +"  "+ y +" " +z + " ");*/
	
		int x = 10 , y=5;
		int exp1 = (y*(x/y*x/y));
		int exp2 = (y*x/y + y*x/y);
		System.out.print(exp1+" "+exp2);
		
  
	}
}
