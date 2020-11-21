package testing;

public class manual {        //decleare  a class
	
	public static void main(String[] args) {
		//int month 7  ,  string month July
		  String M ="August";
		int month = 7;
        switch(month) {
        
//        case 1 : System.out.println("jan");
//        break;
//        
//        case 2 : System.out.println("feb");
//        break;
//        
//        case 6: System.out.println("july");
//        break;
//        
        case 'A': M="1 - January";  
        break;    
        case 'B': M="2 - February";  
        break;    
        case 'C': M="3 - March";  
        break;    
        case 'D': M="4 - April";  
        break;    
        case 'M': M="5 - May";  
        break;    
        case 2: M="7 - July";  
        break;  
        case 8: M="8 - August";  
        break;
        
        default:System.out.println("Invalid Month!");
        }
        System.out.println(M);
          
        }}

		
		


