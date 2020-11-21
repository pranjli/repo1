package Test;

public class ClassNew implements Xy{

		@Override
	public void engine() {
		System.out.println("bike have engine");
		
	}

	@Override
	public void seat() {
		System.out.println("bike have seat");
		
	}

	@Override
	public void wheel() {
		System.out.println("bike have wheel");
		
	}

	@Override
	public void handle() {
		System.out.println("bike have handle");
		
	}
public static void main(String[] args) {
	ClassNew obj = new ClassNew();
	obj.engine();
	obj.handle();
	obj.handle();
	
	
	
	
}
}
