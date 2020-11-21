
public class HeroHonda extends Bike{
	@Override
	public void engine() {
		System.out.println("Bikes have engine");
	}
   public static void main(String[] args) {
	//create object
	   HeroHonda obj = new HeroHonda();
	   obj.seat();
	   obj.wheels();

	}
}
