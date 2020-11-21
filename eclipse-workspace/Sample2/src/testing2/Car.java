package testing2;

public class Car {
	
	// defining attributes 
	
	private  long id;
	private String name;
	private int wheel;
	private String description ;
	private int speed;
	
	// access modifier and constructor : public Car ( ) 
	//In constructor no return time
	
	public Car(long id, String name, int wheel, String description, int speed) { 
		super();
		this.id = id;
		this.name = name;
		this.wheel = wheel;
		this.description = description;
		this.speed = speed;
	}
	
	// defining method
	
public void start() {
	System.out.println("Car started");
}
	
	public void stop() {
		System.out.println("car stopped");
	}
	
	public void speedup() {
		this.speed+=5;
		System.out.println(speed);
	}

	public void speeddown() {
    this.speed-=5;
    if(this.speed<0) {
    	this.speed=0;
    }
	System.out.println(speed);
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


	
	
	
}



	
	
	
	
	

	


