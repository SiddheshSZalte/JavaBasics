package javaRevision;

public class Greatestof3 {
	public static void main(String args[]) {
		int c = 6;
		int d = 6;
		int e = 7;
		
		if ((c>d) && (c>e)) {
			System.out.println("greater:"+c);
		}
		else if (d>e) {
			System.out.println("greater"+d);
		}
		else if ((c==d) && (c==e)) {
			System.out.println(c+","+d+","+e+" are equal");
        }
		else {
			System.out.println("greater:"+e);
		}
	}

	}


