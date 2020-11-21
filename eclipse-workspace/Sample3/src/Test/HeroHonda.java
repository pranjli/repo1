package Test;

public class HeroHonda extends Bike{
	@Override
	public void engine() {
		System.out.println("Bike have engine");
		
	}

	@Override
	public void wheels() {
		System.out.println("Bike have wheels");
	}
		public static void main(String[] args) {
			// create object
			HeroHonda obj = new HeroHonda();
			obj.engine();
			obj.handle();
			obj.seat();
			obj.wheels();
	

}
}