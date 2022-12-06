
public class CoreJavaBrusUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// string is an object  // String literal
		//String s1 = "Faris Kanbur Academy"
		String s5 = "hello";
		
		
		//new
		String s2 = new String("welcome");
		String s3 = new String("welcome");
		
		String s = "Faris Kanbur Academy";
	    //String[] splittedString = s.split(" ");
	    String[] splittedString = s.split("Kanbur");

	    System.out.println(splittedString[0]);
	    System.out.println(splittedString[1].trim());
	    
	    for( int i = 0; i<s.length(); i++)
	    {
	    	System.out.println(s.charAt(i));
	    	
	    }
	    
	    for( int i = s.length()-1; i>-1; i--)
	    {
	    	System.out.println(s.charAt(i));
	    	
	    }

	    
	}

}
