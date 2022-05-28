package TestPracticefistdayTo25jan;

public class AssWK2Q3 {

	static void method (int i)
	{
		// int i=1; 
		
		
		for (i=1; i<=10; i++)
		{
			
			if (i%2==1)
			{
			System.out.println("odd number "+i);
				
			}
			else
			{
				System.out.println("NO odd number "+i);
				
			}
			
		}}
		
static	void pawar (int i)
	{
		int addi = 0;
		// for (i=1; i<=;i++)
	while (i<=10)
	{
		
	if (i%2!=0)

	addi=addi+i;
	i=i+1;


	}	

	System.out.println("addition odd number is " + addi);
	}
		
		
		public static void main(String[] args) {
		
		AssWK2Q3.method(1);
		
		pawar(1);
		
	}
	
}
