package javaRevision;
class Variable{
	int a = 10;//class level scope(can be used any where in the class
	void demo () {
		System.out.println(a);
	    int a = 5;// method level scope (can be used within the method only
		System.out.println(a);
	}
	{
		int a = 20;//block level scope(can be used within the curly braces only 
	}// this is applicable for If-else and loops also
	
}
public class VariableScope {


public static void main(String args[]) {
	Variable v1 = new Variable();
	v1.demo();
}
}
