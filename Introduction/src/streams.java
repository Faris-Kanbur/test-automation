import java.util.ArrayList;

public class streams {
	
	// Count the number of names starting with alphabet A in list
	public void reqular() {
		
		ArrayList<String> names = ArrrayList<String>();
		
		names.add("Ahmet");
		names.add("faris");
		names.add("Aleyna");
		names.add("Adam");
		names.add("Michael");
		
		
		int count = 0;
		for(int i= 0; i<names.size(); i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
