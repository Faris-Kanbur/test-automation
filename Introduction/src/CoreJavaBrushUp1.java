 
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1-Variable in Java
		
		int myNum = 5;
		String website = "faris kanbur";
		char letter = 'r';
		double dec = 5.99 ;
		boolean myCard = true;
		
		System.out.println(myNum + " is the my best number");

		//2- Arrays in Java
		
		int[] arr = new int[5];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
		int[] arr2 = {0,1,2,3,4};
		
		//System.out.println(arr2);
		
		// 3- for Loop
		
		for( int i = 0; i < arr2.length; i++)
		{
			System.out.println(arr[i]);
		}		
		
        String[] name = {"faris", "ali", "suna"};
		
		for( int i = 0; i <name.length; i++) 
		{
			System.out.println(name[i]);
		}
		
		
		for( String s : name)
		{
			System.out.println(s);
		}
			
		
		
		
	}

}
