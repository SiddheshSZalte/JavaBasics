package javaRevision;

public class TypePromotions {
public static void main(String args[]) {
	int a = 7;
	short b = 9;
	byte c = 9;
	
    int d = a+b+c;// if operation contains byte,short,char then the answer
                  //will be converted to int always
//	System.out.print(d);
	
    //but if contains any from float ,long,double then will be converted to one of them 
	//in a order long => float=> double
	float e = 9.8f;
	long g = 2846894;
	double h = 7786.78;
	double x = 738.98;
	double v = e+g+h+x;
	long f = (long)((long)e+g+h+x);
	
	
	
	
}
}
