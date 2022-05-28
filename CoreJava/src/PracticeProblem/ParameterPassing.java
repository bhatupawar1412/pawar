package PracticeProblem;

public class ParameterPassing {

	void m1(int i)
	{
		int x=0;
		int y=0;
		
		for (i=10; i>=1; i--)
		{
			if(i%2==0)
			{
				System.out.println("even number :"+i);
		          x=x+i;
			}
			else
			{
				System.out.println("odd number :"+i);
			y=y+i;
			}
		}
		System.out.println("sum :"+x);
		System.out.println("sum :"+y);
	}
	
	public static void main(String[] args) {
		ParameterPassing obj =new ParameterPassing();
		obj.m1(0);
	}
}
