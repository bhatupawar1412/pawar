package CoreJava;

public class EvenOdd {       //  for loop problem 
	
	
	int x=10; 
	
	void number()

{
	for (int x=1; x<=10; x++ ) 
	{
		if(x%2==0)
		{
			System.out.println("even");
			
		}
		
		else
		{
			System.out.println("odd" );
			
		}
	}

}
 
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd obj = new EvenOdd ();
		obj.number();
	
	}

}
