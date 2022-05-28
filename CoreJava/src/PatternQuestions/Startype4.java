package PatternQuestions;

public class Startype4 {

	static void forloop ()
	{
		int num =3;
		for (int a=1;a<=num;a++)
		{
			for (int b=a;b<=num;b++)
			{
				System.out.print(" ");
			}
			for (int b=1; b<a; b++)
			{
				System.out.print("*");
			}
			for (int b=1; b<=a; b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Startype4.forloop();
	}

}
