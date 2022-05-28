package TestPracticefistdayTo25jan;

public class Asswk4Q2fizzbuzz {
	
	void method ()
	{
		for (int i=1; i<=20; i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("fizzbuzz");
			}
			else if (i%3==0)
			{
				System.out.println("fizz");
			}
			else if (i%5==0)
			{
				System.out.println("buzz");
			}
			else 
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Asswk4Q2fizzbuzz obj = new Asswk4Q2fizzbuzz ();
		 obj.method();
	}

}
