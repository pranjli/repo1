package Testing2;

public class Example {
	
	// declare static variables 
	static int a= 10;
	static int b=20;
	// declare non static variables 
	int c=30;
	int d=40;
	//create static method with returning a value
	public static  int add() {
		int result = a+b;
		return result;
			}
		//create static method without returning a value
	public static void sub() {
		System.out.println(a-b);
			}
		//create non static method with returning a value
    public int add1() {
	int result1 = c+d;
	return result1;
}

//create non static method without returning a value
public void multiplay() {
	System.out.println(c*d);
}
	public static void main(String[] args) {
		// Access static class members(using class name)
		// returning a value
		int x = Example.add();         
		System.out.println(x);
		System.out.println(Example.a);
		
		//without returning a value
		Example.sub();
		
		//access non static class members
		//returning a value
		Example E = new Example();
		int y=E.add1();
		System.out.println(y);
		
		// return nothing
		E.multiplay();
		
	}

}
