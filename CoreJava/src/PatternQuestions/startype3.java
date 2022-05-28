package PatternQuestions;

public class startype3 {
	
	static void pawar()
	
	{
		int sum =4;
		for (int a=1;a<=sum; a++)
		{
			System.out.println(a );
			if (a<sum)
			{
				for (int b=1; b<=a; b++)
				{
					System.out.print(b+" ");
				}
			}
			}
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		startype3.pawar();
		
	}

}
