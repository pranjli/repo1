package log4demo;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {

			System.out.println("Hello Word");
			int i = 1/0;
			System.out.println("completed");
		}
		catch(Exception exp){
			System.out.println("I am inside catch block");
			System.out.println(exp.getMessage());
			System.out.println("Message is :"+exp.getMessage());
			System.out.println("cause is :"+exp.getCause());
			exp.printStackTrace();
		}
	}}
