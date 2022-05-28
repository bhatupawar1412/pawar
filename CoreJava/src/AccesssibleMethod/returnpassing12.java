package AccesssibleMethod;

public class returnpassing12 {
	int fizzbuzz (int i)
	{
		for(i=1;i<=20;i++)
		{
			if (i%3==0 && i%5==0)
			{
				System.out.println("fizzbuzz");
			}
			else if (i%3==0)
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
		return i;
	}
public static void main(String[] args) {
	returnpassing12 obj = new returnpassing12 ();
	// System.out.println(obj.fizzbuzz(1)); for example
	obj.fizzbuzz(1);
}
}
