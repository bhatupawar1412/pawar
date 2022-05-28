package AccesssibleMethod;

public class ParameterFizzBuzzQ3 {
	public void fizzbuzz(int i)
	{
		for (i =1; i<=20;  i++)
		{
			if (i % 3==0 && i % 5==0)
			{
				System.out.println("fizzbuzz");
			}
			else if (i % 3==0)
			{
				System.out.println("fizz");
			}
			else if(i % 5==0)
			{
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}}}
			
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			ParameterFizzBuzzQ3 obj1 = new ParameterFizzBuzzQ3();
			obj1.fizzbuzz(1);
	}

}
