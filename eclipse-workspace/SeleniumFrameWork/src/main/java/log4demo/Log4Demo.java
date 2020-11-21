package log4demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Log4Demo {

	static org.apache.logging.log4j.Logger logger = LogManager.getLogger(Log4Demo.class);
			
	public static void main(String[] args) {
		System.out.println("Hello");
logger.info("This is information");
logger.error("This is an error message");

System.out.println("Completed");
	}

}
