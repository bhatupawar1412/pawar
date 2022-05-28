package Assingnment;

public class AssingmentWhileQ2evemOdd {

	// 1 to 10 print evenodd number with addition
	
	void evenodd ()
	{int i =1;
	int x =0 ;
	int y= 0 ;
	
		while (i<=10)
		{
			if (i%2==0)
			{
				System.out.println("even "+i);
				i=i+1;
				x=x+i-1;
			}
			else 
			{
				System.out.println("odd "+i);
				i=i+1;
				y=y+i-1;
			}
			System.out.println("even addition "+x);
			System.out.println("odd addition "+y);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 AssingmentWhileQ2evemOdd obj = new  AssingmentWhileQ2evemOdd ();
		 obj.evenodd ();
		 
		
	}

}
