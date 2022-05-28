package TestPracticefistdayTo25jan;

public class AssWk1Q8 {

	void m1 ()
	{
		int i=1;
		int sum=0;
		while (i<=5)
		{
			System.out.println(i);
			i=i+1;
			sum=sum+i-1;
		}
		System.out.println(sum);
	}
	
	void m2 ()
	{
		int i=1;
		int x=0;
		int y=0;
		 
		while (i<=10)
		{
			if (i%2==0)
			{
				System.out.println("even "+i);
				i=i+1;
				x=x+i;
			}
			else 
			{
				System.out.println("odd "+i);
				i=i+1;
				y=y+i;
			}
		}
		System.out.println("even adii "+x);
		System.out.println("odd addi "+y);
		
	}
	void m3 ()
	{
		int a=10;
		 
		while (a>=5)
		{
			System.out.println(a);
			a=a-1;
		}
	}
		void m4 ()
		{
			int i=10;
			int sum=0;
			
			while (i>=1)
			{
				System.out.println(i);
				i=i-1;
				sum=sum+i+1;
			}
			System.out.println(sum);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AssWk1Q8 obj= new  AssWk1Q8 ();
		 // obj.m1();
		// obj.m2();
		// obj.m3();
		 obj.m4();
	}

}
