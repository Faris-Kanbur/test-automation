import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr3 = {1,2,3,4,5,6,7,8,122};
		
		for(int i =0; i<arr3.length; i++)
		{
			if(i % 2 != 0) {
				System.out.println(arr3[i]);
				break;
			}
			else 
			{
				System.out.println(arr3[i] + "is not miltiple of 2");
			}
		}
		
		
		ArrayList<String> a = new ArrayList<String>();
		// create object of the class -  object.method
		// here "new" operater create memory
		
		a.add("faris");
		a.add("Kanbur");
		a.add("Selenium");
		String o = a.get(2);
		System.out.println(o);
		
		
		
		
		
	}

}
