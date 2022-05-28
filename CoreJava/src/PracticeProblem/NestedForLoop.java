package PracticeProblem;

public class NestedForLoop {

	void m1()
	
	{
		for (int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	void m2()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
	void m3()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	void m4()
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
	void m5()
	{  
		for(int i=1; i<=4; i++)
	{
		for(int j=1; j<=i; j++)
		{
			System.out.print(j +" ");
		}
		System.out.println(" ");
	}
		
	}
	void m6()
	{for(int i=1; i<=4; i++)
	{
		for(int j=4; j>=i; j--)
		{
			System.out.print(j +" ");
		}
		System.out.println(" ");
	}
		
		
	}
	void m7 ()
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		NestedForLoop obj =new NestedForLoop ()
;
		//obj.m1();
		//obj.m2();
		//obj.m3();
		//obj.m4();
		//obj.m5();
		//obj.m6();
		obj.m7();
	}
	
	
	
}
