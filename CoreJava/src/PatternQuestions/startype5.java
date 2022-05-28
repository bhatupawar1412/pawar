package PatternQuestions;

public class startype5 {
	
	void mom () {
	for (int p=1; p<=3; p++)
	{
	for (int q=1; q<=p;q++ )
	{
		System.out.print("*");
	}
	System.out.println();	
	}	
		for (int p=1; p<=2;p++)
		{
			for (int q=2;q>=p;q--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	void mom1()
	{
		for (int i=1; i<=4; i++)
		{
			for(int j=1; j<=i;j++)
			{
			System.out.print(j+" ");
			}
			System.out.println();
		}
	
	
			
	}
	public static void main(String[] args) {
		startype5 obj = new startype5 ();
		obj.mom();
		obj.mom1();
	}
}