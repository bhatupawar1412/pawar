package TestPracticefistdayTo25jan;

public class AssWk2Q1 {

	void parameter (int i)
	{
		// int i=1;
		// int i LHS pass information upper &
		// 1 information down object
		for (i=1; i<=10; i++)
		{
			if (i%2==0)
			{
				System.out.println("even number "+i);
			}
			else
			{
				System.out.println("odd number "+i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssWk2Q1 oo =new AssWk2Q1 ();
		oo.parameter(1);
	}

}
