package PatternQuestions;

public class newstar {

	static void bhatu() {
	
		for (int a=1; a<=5;a++)
		{
			for(int b=1; b<=a;b++)
			
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		for (int a=1;a<=4;a++)
		{
			for (int b=4;b>=a;b--)
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
			
	}
	
	
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
newstar.bhatu();
	}

}
