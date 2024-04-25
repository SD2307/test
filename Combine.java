
public class Combine 
{
 //Static Data Member 
	static int a=10;
	
 //Non-Static Data Member 
	int b=20; 
	
 //Static Member Function 
	static void test01()
	{
	 System.out.println("Static Member Function Running...");
	}
	
 //Non-Static Member Function 
	void test02()
	{
	 System.out.println("Non-Static Member Function Running...");
	}
	
 //Static Block 
	static 
	{
	 System.out.println("Static Block Running..."); 
	}
	
 //Non-Static Block 
	{
	 System.out.println("Non-Static Block Running");
	}
	
 //Constructor 
	Combine()
	{
	 System.out.println("Constructor Running...");
	}
	
 //Main Method Declaration
	public static void main(String [] args)
	{
		//Main Method Started 
		System.out.println("Main Method Started...");
		
		//Calling Static Data Member 
		System.out.println(Combine.a);
		
		//Calling Static Member Function 
		Combine.test01();
		
		//Calling Non-Static Data Member
		Combine c1=new Combine();
		
		System.out.println(c1.b);
		
		//Calling Non-Static Member Function
		c1.test02();
		
		//Main Method End
		System.out.println("Main Method Ended");
	}
}
