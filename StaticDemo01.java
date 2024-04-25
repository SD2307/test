
public class StaticDemo01 
{
 //Static Data Member 
	static int a=10; 

 //Static Member Function 
	static void demo()
	{
		System.out.println("Running Static Method..."); 
	}
	
 //Static Block 
	static 
	{
		System.out.println("Running Static Block..."); 
	}
	
 //Main Method Declaration 
 public static void main(String [] args)
 {
	 //Starting Main Method
	 System.out.println("Main Method Started");
	
	 //Static Data Member Call 
	 System.out.println(StaticDemo01.a); 
	 
	 //Static Member Function Call
	 StaticDemo01.demo();
	 
	 //Main Method End
	 System.out.println("Main Method Ended"); 
 }
	
}
