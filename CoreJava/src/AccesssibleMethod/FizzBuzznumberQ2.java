package AccesssibleMethod;

public class FizzBuzznumberQ2 {
	void fizz ()
	{
		for(int i =1; i<=20;i++)   // 1 TO 20 Fizz buzz number
		{
			if (i%3==0)
			{
				System.out.println("fizz number is "+i);
				
			}
			else {
				System.out.println("not fizz number "+i);
				
			}
			if (i%5==0) {
				System.out.println("buzz number is "+i);
			}
			else {
				System.out.println("not buzz is "+i);
			}
			if(i%3==0 && i%5==0)
			{
				System.out.println("fizzbuzz number "+i);
			}
		}
	}
public static void main(String[] args) {
	
	FizzBuzznumberQ2 obj = new FizzBuzznumberQ2();
	obj.fizz();
}
	
}
