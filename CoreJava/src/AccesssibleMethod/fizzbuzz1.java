package AccesssibleMethod;

public class fizzbuzz1 {    
	
static void buzz ()                              // 1 to 20
	{
		for (int i=1; i<=20; i++)
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
		
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		fizzbuzz1.buzz();
		
		
	}

}
