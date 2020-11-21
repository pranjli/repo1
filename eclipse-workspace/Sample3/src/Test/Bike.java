//it is process of hiding internal implemetation showing only functionalty to the user
//1. concrete method : the method which r having body
// Abstract : the method which r not having body
package Test;
public abstract class Bike {
	// concrete method
	public void handle() {
		System.out.println("Bikes have handle");
	}
	public void seat() {
		System.out.println("bike have seats");
	}
 // abstract method
	public abstract void engine();
	public abstract void wheels();

	public static void main(String[] args) {
	HeroHonda obj1 = new HeroHonda();
	obj1.engine();
	obj1.handle();
		

	}

}
