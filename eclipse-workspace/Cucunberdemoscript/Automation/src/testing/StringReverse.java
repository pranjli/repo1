package testing;

public class StringReverse {

	public static void main(String[] args) {
		
	String name="Pranjli";
	int lent=name.length();
	String rev="";
	
	for(int i=lent-1;i>=0;i--) {
		
		rev=rev+name.charAt(i);
	}
		System.out.println(rev);
	
	
		
		
	}
}

