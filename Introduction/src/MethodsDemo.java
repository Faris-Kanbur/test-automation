
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		
		
	String d6 = getData2();
	System.out.println(d6);

	}
	
	public String getData() 
	{
		System.out.println("hello world");
		return "Faris Kanbur";
	}
	
	public static String getData2() 
	{
		System.out.println("hello Mehmet");
		return "Mehmet Kanbur";
	}

}
