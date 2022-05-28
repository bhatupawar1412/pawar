package PracticeProblem;

public class ForLoppEx1 {

	static void method()
	{
		//1. Write a program to print number from 10 to 1

		for(int i=10; i>=1; i--)
		{
			System.out.println(i);
		}
	}
	static void m()
	{
		int sum=0;
		for (int i=1; i<=10; i++)

		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("sum "+sum);
	}
	static void m1()
	{
		int x=0;
		int y=0;
		for(int i=1; i<=5; i++)
		{
			if(i%2==0)
			{
				System.out.println("even "+i);
				x=x+i;
			}
			else
			{
				System.out.println("odd "+i);
			y=y+i;
			}
		}
		System.out.println(" sum even "+x);
		System.out.println("sum odd "+y);
		
	}
	static void m2()
	{
		int num=1234;
		int rev=0;
		int last=num%10;
		
		for(int i=1; i<=4; i++)
		{
			if(num>0)
			{
				last =num%10;
				rev=rev*10+last;
				num/=10;
				
			}
			
		}
		System.out.println("reverse :"+rev);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	method();
		//m();
		//m1();
		m2();
	}

}
