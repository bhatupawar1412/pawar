package PracticeProblem;

public class FizzBuzzNumber {
void method()
{
for(int i=1; i<=20; i++)
{
	if(i%3==0 && i%5==0)
	{
		System.out.println("fizz buzz number");
	}
	else if(i%3==0)
	{
		System.out.println("fizz");
	}
	else if (i%5==0)
	{
		System.out.println("buzz");
	}
	else
	{
		System.out.println(i);
	}
}
}
	
	public static void main(String[] args) {
		FizzBuzzNumber obj=new FizzBuzzNumber();
		obj.method();
	}
}
