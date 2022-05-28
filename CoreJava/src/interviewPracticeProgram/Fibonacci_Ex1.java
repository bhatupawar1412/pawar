package interviewPracticeProgram;

public class Fibonacci_Ex1 {

	void method()
	{
		// 0 1 2 3 4 5 6 7 ..
		//a+b c=a+b d=b+c ...
		int a=0, b=1;
		System.out.println(a+" "+b);
	int c;
	for(int i=1; i<=10; i++)
	{
		c=a+b;
		System.out.print(c+ " ");
		a=b;
		b=c;
		
	}
	System.out.println();
	}
	void m()
	{
		int a=0, b=1;
		
		int c;
		
		for(int i=1; i<=100; i++)
		{
			c=a+b;
			System.out.print(c +" ");
			a=b;
			b=c;
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		Fibonacci_Ex1 obj= new Fibonacci_Ex1();
		obj.method();
		obj.m();
		
		
	}
}
