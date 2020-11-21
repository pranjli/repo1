package testing1;

public class oops {

	//declear static variable
			static int a = 10;
			static int b=20;
			//declear non static variable
			int c =30;
			int d=40;
			// create a static method with returning a value 
			
			public static int multiplay() {
				int result = a*b;
				return result;
			}
			
			// create a static method without returning a value 
			public static int add() {
				System.out.println(a+b);
				return a;
			}
						
			// create a non static method with returning a value 
			
			public int add2 () {
				int result = c+d;
				return result;
			}
			// create a non static method without returning a value 
						public void  sub() {
				System.out.println(c-d);
			}
	
public static void main(String [] args) {
	//access static class members
	int x= oops.add();
	System.out.println(x);
	
}
}
