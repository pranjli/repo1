package date;

public class method {
	
	public int add() {
	int a=100; int b= 200;
	return a+b;
		}

	public int sub() {
		int c=20; int d= 90;
		return c-d;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method obj1 = new method();
		int res = obj1.add();
		System.out.println(res);
		
		method obj2 = new method();
		int res2 = obj2.sub();
		System.out.println(res2);
		
	}

}
