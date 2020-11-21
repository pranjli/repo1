package testing1;

public class Tv {

	// Attribute
	private int id;
	private String name;
	private int size;
	private int volume;
	private boolean isOn;
	
	// creating constructor
		public Tv(int id, String name, int size, int volume, boolean isOn) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
		this.volume = volume;
		this.isOn = isOn;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public static void main(String[] args) {
		Tv tv=new Tv(1,"LG", 30,10,true);
           System.out.println(tv.getId()+" "+tv.getName()+" " +tv.size+" "+tv.volume+" "+tv.isOn);
  	
	}

}
