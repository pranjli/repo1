package testing2;

public class Employee {
	
	// instance variable 
	private long empid;
	private String empname;
	
	// toString name method 
	public String toString(){ 
	return (this.empid+" " + this.empname);}
		
	// constructor name should same as class name 
	Employee(long id,String name){
		this.empid = id;
		this.empname = name;
		}
		
	public static void main(String[] args) {
		
		// call constructor
		Employee obj1= new Employee(1, "Pranjli");
		Employee obj2 = new Employee(2, "mayur");
		System.out.println(obj1);
		System.out.println(obj2);
			}
}
