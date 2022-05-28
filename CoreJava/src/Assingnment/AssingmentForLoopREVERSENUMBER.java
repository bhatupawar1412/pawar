package Assingnment;

public class AssingmentForLoopREVERSENUMBER {

	void rev ()
	{
		int num =12345;
		int rev = 0;
		int lastdigit = num%10;
		for (int i=1 ; i <=5; i++)
		{
			if (i<=5)
			{
				lastdigit = num%10;
				rev=rev*10+lastdigit;
				num/=10;
			}
			
		}
		System.out.println("reverse number "+rev);
		System.out.println("--------------------");
		
	}
	void palindrom ()
	{

		int num =12321;
		int rev = 0;
		int lastdigit = num%10;
		for (int i=1 ; i <=5; i++)
		{
			if (i<=5)
			{
				lastdigit = num%10;
				rev=rev*10+lastdigit;
				num/=10;
			}
			
		}
		System.out.println("palindrom number "+rev);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AssingmentForLoopREVERSENUMBER obj = new AssingmentForLoopREVERSENUMBER ();
		 obj.rev();
		 obj.palindrom ();
	}

}
