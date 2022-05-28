package TestPracticefistdayTo25jan;

public class Ass10Q1 {

	void whileWithrev ()
	{
		int number = 12345;
		int rev=0;
		int last=number%10;
		
		while (number>0)
		{
			last=number%10;
			
			rev=rev*10+last;
			number/=10;
		}
		System.out.println("Reverse= "+rev);
	}
	void ForLoop ()
	{
		
		int num=12345;
		int rev =0;
		int last =num%10;
		for(int i=1; i<=5; i++)
		{
			if (num>0)
			{
				last=num%10;
				
				rev=rev*10+last;
				num/=10;
			}
			
		}
		
		System.out.println("Reverse= "+rev);
		
	}
	void dowhile ()
	{
		int num=12345;
		int rev=0;
		int last=num%10;
		
		do 
		{last=num%10;
		
		rev=rev*10+last;
		num/=10;
			
		}
		while (num>0);
		System.out.println("Reverse= "+rev);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass10Q1 obj = new Ass10Q1();
		 // obj.whileWithrev(); 
		obj.ForLoop();
		obj.dowhile();
	}

}
