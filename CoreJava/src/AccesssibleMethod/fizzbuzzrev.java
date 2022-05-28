package AccesssibleMethod;

public class fizzbuzzrev {
	
	void method (int i)
	{

		for ( i=1; i<=20; i++)
		{
			if (i%3==0 && i%5==0)
			{
				System.out.println("fizzbuzz");
			}
			else if(i%3==0)
			{
				System.out.println("fizz");
			}
			else if (i%5==0)
			{
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
	}}}
	
		int method1 (int number)
	{
		System.out.println(number);
		return number ;
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		fizzbuzzrev obj = new fizzbuzzrev ();
		obj.method(1);
		obj.method(20);
	}

}
