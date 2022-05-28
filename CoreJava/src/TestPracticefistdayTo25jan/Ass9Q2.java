package TestPracticefistdayTo25jan;

public class Ass9Q2 {

	void evenodd ()
	{
		int sum=0;
		int sum1=0;
		
		for (int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println("even "+i);
				sum=sum+i;
			}
			else 
			{
				System.out.println("odd "+i);
				sum1=sum1+i;
			}
		}
		
		System.out.println("even addi " +sum);
		System.out.println("odd addi" +sum1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass9Q2 obj = new Ass9Q2 ();
		obj.evenodd();
	}

}
