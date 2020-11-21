package abc;

public class MethodOverriding1 {
	public void mymethod() {
	System.out.println("UFT for test automation");
	}
	public static void main(String[] args) {
		MethodOverriding1 obj = new MethodOverriding1();
		obj.mymethod();

		MethodOverriding obj2 = new MethodOverriding();
		obj2.mymethod();
		
	}

}
