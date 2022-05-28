package PracticeProblem;

public class evenadd {
	void method()
	{
		//1. Create new class and write down number from (1 to 10) in method. 
	    //In main method check whether number is even or odd.
		int a=1;
		if(a%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		int b=2;
		if(b%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

	public static void main(String[] args) {
		
		evenadd obj =new evenadd ();
		obj.method();
           
	}

}
