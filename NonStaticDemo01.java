
public class NonStaticDemo01 
{
 //Non-Static Data Member
  int a=20; 
	
 //Non-static Member Function
  void test()
  {
	System.out.println("Non-Static Member Function Running..."); 
  }
  
  //Non-Static Block 
  {
	  System.out.println("Non-Static Block Running...");
  }
  
  //Constructor
  NonStaticDemo01()
  {
	System.out.println("Constructor Running...");  
  }
  
  //Main Method Declaration 
  public static void main(String [] args)
  {
	 //Main method Started 
	System.out.println("Main Method Started...");
	
	//Non-Static Data Member Calling 
	NonStaticDemo01 n=new NonStaticDemo01(); 
	
	System.out.println(n.a);
	
	//Non-Static Member Function Calling
	n.test();
	
	//Main Method End
	System.out.println("Main Method Ended..."); 
  }
}
