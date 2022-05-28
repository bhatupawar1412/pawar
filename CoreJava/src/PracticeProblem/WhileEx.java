package PracticeProblem;

public class WhileEx {
	void m1()
	{
		int i=1;
		int sum=0;
		while(i<=10)
		{
			System.out.println(i);
			i=i+1;
			sum=sum+i-1;
		}
		System.out.println("sum "+sum);
	}
	void m2()
	{
		int i=1;
		int x=0;
		int y=0;
		
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println("even "+i);
				i=i+1;
				x=x+i-1;
			}
			else
			{
				System.out.println("odd "+i);
				i=i+1;
				y=y+i-1;
			}
			
		}
		System.out.println("even :"+x);
		System.out.println("odd :"+y);
	}
	void dowhile()
	{

		int i=1;
		int x=0;
		int y=0;
		
		do 
		{
			if(i%2==0)
			{
				System.out.println("even "+i);
				i=i+1;
				x=x+i-1;
			}
			else
			{
				System.out.println("odd "+i);
				i=i+1;
				y=y+i-1;
			}
			
		}while(i<=10);
		System.out.println("even :"+x);
		System.out.println("odd :"+y);
		
		
	}
	public static void main(String[] args) {
		WhileEx obj =new WhileEx();
		//obj.m1();
		//obj.m2();	
		obj.dowhile();
		
	}

}
