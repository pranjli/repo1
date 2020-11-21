
public class practice {
//inheritance 
	// with returning a value , without returning , static 
	
	static int a=10;
	static int b=20;
	int c=30;
	int d=40;
	
	public static int add() {
	int result =a+b;
	return result;
	}
	
	public static void multiply() {
		System.out.println(a*b);
	}
	
	public int add2() {
		int res=c+d;
		return res;
			}
	
	public void multiply1() {
		System.out.println(c*d);
	}
	    public static void main(String[] args) {
		int x= practice.add();
		System.out.println(x);
		System.out.println(a);
		practice.multiply();
		
		//non static 
		practice obj = new practice(); 
		int y =  obj.add2();
		System.out.println(y);
		System.out.println(obj.c);
		obj.multiply1();
		
}}
