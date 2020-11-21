package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	

	public static void main(String[] args) {
		
//		// Instantiate a Date object
//		Date date = new Date();
//		// display time and date using toString()
//        System.out.println(date.toString());
//		
        
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E DD.MM.YYYY 'at' hh:mm:ss a zzz");
		
		System.out.println("current Date: " +date);
        
        
        
	}
}
