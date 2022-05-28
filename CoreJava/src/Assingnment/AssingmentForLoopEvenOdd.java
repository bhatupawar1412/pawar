package Assingnment;

public class AssingmentForLoopEvenOdd {

	// 1 to 10 print even odd number with addition
	
	
	void evenodd ()
	{
		
		int sum =0;
		int x=0;
		int y=0;
		for (int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println("even number is "+ i);
				
				 x=x+i;
			}
			else 
			{
				System.out.println("odd number is "+i);
			
				y=y+i;
			}
			
		}
		System.out.println("addition "+x);
		System.out.println("addition "+y);
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AssingmentForLoopEvenOdd obj = new AssingmentForLoopEvenOdd();
		obj.evenodd ();
		
	}

}
