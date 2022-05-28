package ConstructorTopics;

public class ConstructorTopics{

  ConstructorTopics ()
	{
	 System.out.println("this is defaults constructor");
	}	
	ConstructorTopics (int a)
	{
		 System.out.println("this is parametrized constructor "+ a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConstructorTopics objA = new ConstructorTopics ();
		ConstructorTopics objB= new ConstructorTopics (10);
	//	ConstructorPrivateMM obj = new ConstructorPrivateMM ();
		
		
	}

}
