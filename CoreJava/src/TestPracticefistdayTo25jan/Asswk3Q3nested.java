package TestPracticefistdayTo25jan;

public class Asswk3Q3nested {

	void nested ()
	{
		
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++)
			{
				int num=0;
				num=i*j;
				
				System.out.print(num + " ");
			}
			System.out.println(" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asswk3Q3nested o = new Asswk3Q3nested ();
		o.nested();
	}

}
