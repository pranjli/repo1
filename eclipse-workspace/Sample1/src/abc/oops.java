package abc;

public class oops {
		// declare static variables
		static int a = 10 , b =20;
		
		// declare non static variables
		int c= 30 , d= 40;
		
		//create static method with returning a value
		public static int add() {
			int result  = a+b;
			return result;
					}
		
		//create static method without returning a value
		public static void multiplay() {
			System.out.println(a*b);
		}
		
		//create non static method with returning a value
		public int add2() {
			int res=c+d;
			return res;
		}
		// create non static method without returning any value
		public void multiplay2() {
			System.out.println(c*d);
		}
		public static void main(String[] args) {
			//access static class members (using class name)
			int x = oops.add();
			System.out.println(x);
			System.out.println(oops.a);
			
			oops.multiplay();
			
			//access non static class members (using object name)
			oops obj = new oops();
			int y = obj.add2();
			System.out.println(y);
			System.out.println(obj.c);
			
			obj.multiplay2();
			
			
			
			
			
			
	}

}
