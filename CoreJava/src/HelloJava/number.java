package HelloJava;

public class number {
int y=0;
int v=0;	
	
	void even()
	
	{
		for(int x=10; x<=100; x++  )
		
		{
			if (x%2==0)
			
			{
				System.out.println("even " + x);
				
				y=y+1;
			}
			else
			{
			System.out.println("odd " + x);	
			v=v+1;
			
				}
			
		}
		System.out.println("even number is"+ y);
		
		System.out.println("odd number is" + v);
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		number obj = new number();
		obj.even();
	}

}
