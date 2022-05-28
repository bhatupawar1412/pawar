package interviewPracticeProgram;

public class Prime_Ex1 {

	public static void main(String[] args) {
		
		int num=15;
		int ac=0;
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				ac++;
			}
		}
		if(ac==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("no prime");
		}
	}
}
