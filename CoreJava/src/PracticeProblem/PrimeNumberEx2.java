package PracticeProblem;

public class PrimeNumberEx2 {

void prime()
{
	int a=15;
	int c=0;
	for(int i=1;i<=a;i++)
	{
		if(a%i==0)
		{
			c++;
		}
	}
	
	if(c==2)
	{
		System.out.println("no is prime");
	}
	else
	{
		System.out.println("not");
	}	

}

	public static void main(String[] args) {
		
		PrimeNumberEx2 obj =new PrimeNumberEx2();
		obj.prime();
		
		
		
		
	}
}




	


