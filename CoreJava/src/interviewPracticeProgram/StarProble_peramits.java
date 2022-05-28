package interviewPracticeProgram;

public class StarProble_peramits {

	public static void main(String[] args) {

		// Ex1

//		for (int i=1; i<=4; i++)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print(" * ");
//				
//			}
//			System.out.println(" ");
//			
//		}
		//Ex2
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		for(int i=1; i<=4; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}
}