package PatternQuestions;

public class Starttype8 {

	static void pawar ()
	{
		for (int i=1; i<=3; i++)
		{
			for (int j=1; j<i; j++)
			{
				System.out.print("* ");
				for (int k=1; k<=i; k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Starttype8 .pawar();

	}

}
