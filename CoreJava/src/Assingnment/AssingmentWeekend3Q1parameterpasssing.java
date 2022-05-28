package Assingnment;

public class AssingmentWeekend3Q1parameterpasssing  {

	void method (int x , int y)
	{
		if (x>y)
			
		{
			System.out.println(x);
			System.out.println(y);
			
			System.out.println("x is gretest number");
		}
		else 
		{
			System.out.println("x is gretest number");
		}
	}
	int  returnmethod (int a)
	{
		System.out.println(a);
		return a;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssingmentWeekend3Q1parameterpasssing obj = new AssingmentWeekend3Q1parameterpasssing ();
		obj.method(50, 20);
		obj.returnmethod(50);
	}

}
