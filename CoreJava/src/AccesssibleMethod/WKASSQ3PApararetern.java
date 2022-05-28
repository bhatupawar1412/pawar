package AccesssibleMethod;

public class WKASSQ3PApararetern {
	void method (int a)         // parameter passing 
	{
		for (a=1; a<=20; a++)
		{
			if(a%3==0 && a%5==0)
			{
				System.out.println("fizzbuzz");
			}
			else if (a%3==0)
			{
				System.out.println("fizz");
			}
			else if (a%5==0)
			{
				System.out.println("buzz");
			}
			else
			{
				System.out.println(a);
			}
		}
	}
	int  method1 (int a)
	{
		for (a=1; a<=20; a++)
		{
			if( a%3==0 && a%5==0 )
			{
				System.out.println("fizzbuzz");
				
			}
			else if (a%3==0)
			{
				System.out.println("fizz");
			}
			else if (a%5==0)
			{
				System.out.println("buzz");
			}
			else
			{
				System.out.println(a);
			}
			
		}
		return a;
		
	}
	
public static void main(String[] args) {
	
	 WKASSQ3PApararetern obj = new  WKASSQ3PApararetern ();
	 obj.method(1);
	 obj. method(1);
}
}
