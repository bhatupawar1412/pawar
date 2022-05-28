package PatternQuestions;

public class Startype6 {
	static void Star ()
	{ 
		int i,j;
		
		for (i=1; i<=4; i++)
		{
			for (j=1; j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
	static void star1()
	{
		int i,j;
		for (i=1; i<=5; i++)
		{
			for (j=1; j<=4; j++)
			{
				System.out.print(i);
			}
				System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Startype6.Star();
		Startype6.star1();
	}

}
