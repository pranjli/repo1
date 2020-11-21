package abc;

public class MethodOverLoading {
	public void add(int a , int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c){
		System.out.println(a+b+c);
		}

	public void add(double a, double b ) {
		System.out.println(a+b);
	}
	
	public void add(double a, double b, double c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.add(10, 20);
		obj.add(10, 20, 30);
        obj.add(1.12, 2.34);
        obj.add(1.23, 2.34, 4.65);
	}

}
