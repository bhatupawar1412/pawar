package PracticeProblem;

public class NestedForLoopEx {
void m1()
{
for(int i=1; i<=4; i++)	
	
{
	for(int j=1; j<=i; j++)
	{
		System.out.print("* ");
	}
	System.out.println("");
}

}
void m2()
{
	for(int i=1; i<=4; i++)
	{
		for(int j=1; j<=4; j++)
		{
			System.out.print(j+" ");
		}
		System.out.println("");
	}
	
}
	
	public static void main(String[] args) {
		NestedForLoopEx obj = new NestedForLoopEx();
		//obj.m1();
        obj.m2();
        
	}

}
