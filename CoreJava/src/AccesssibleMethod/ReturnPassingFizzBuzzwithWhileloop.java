package AccesssibleMethod;

public class ReturnPassingFizzBuzzwithWhileloop {

	int method (int i)
	{
	while (i<=20)
	{
		if (i%3==0 && i%5==0)
		{
			System.out.println("fizzbuzz ");
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
		i++;
	}
		
	return i;	
	}
	
	
	public static void main(String[] args) {
		ReturnPassingFizzBuzzwithWhileloop obj = new ReturnPassingFizzBuzzwithWhileloop();
		
		obj.method(1);
		
	}
	
	
	
	
	
	
	
}