
public class ClassNew implements Interface1{

	@Override
	public void engine() {
		System.out.println("Bike have engine");
		
	}

	@Override
	public void wheels() {
		System.out.println("Bike have wheels");
		
	}

	@Override
	public void seat() {
		System.out.println("Bike have seat");
		
	}

	@Override
	public void handle() {
		System.out.println("Bike have handle");
		
	}
public static void main(String[] args) {
	ClassNew obj = new ClassNew();
	obj.seat();
	obj.wheels();
	obj.engine();
	obj.handle();
}
}
