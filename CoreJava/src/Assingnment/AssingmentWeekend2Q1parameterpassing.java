package Assingnment;

public class AssingmentWeekend2Q1parameterpassing {
	
	
	// 1 to 10 print number with even odd 
	
	void parameterpassing (int i)
	{
		 int x=0;
		 int y =0;
		for (i=1; i<=10; i++)
		{
			System.out.println(i);
			
			if (i%2==0)
			{
				System.out.println("even "+i);
				x=x+i;
			}
			else 
			{
				System.out.println("odd "+i);
			y=y+i;
			}
			System.out.println("addi even "+x);
			System.out.println("addi odd "+y);
		
		}
		System.out.println("--------------");
		}
	
	// same value and diff value 2 String used
	void samevalue2string (String x , String y)
	{
		if (x==y)
		{
			System.out.println("same value ");
		}
		else 
		{
			System.out.println("not same value ");
		}
		System.out.println( "-------------");
	}
	void diffvalue2string (String x , String y)
	{
		if (x==y)
		{
			System.out.println("same value ");
		}
		else
		{
			System.out.println("not same value ");
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssingmentWeekend2Q1parameterpassing   obj =new  AssingmentWeekend2Q1parameterpassing  ();
		 obj.parameterpassing (1);
		 obj.samevalue2string ("bhatu","bhatu");
		 obj.diffvalue2string("bhatu", "pawar");
	}

}
