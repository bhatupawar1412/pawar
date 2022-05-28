package Assingnment;

public class AssingmentLogicaloperator {
	
	// && operater is both condition true so one condition is false result false
	
	void method ()
	{
		int a=10;
		int b=20;
		int c=30;
		if (a<b && b<c)
		{
			System.out.println(" a is gretest number than b and c");
		}
		else 
		{
			System.out.println("given condition is false");
		}
		System.out.println("-----------------");
	}
	void method1 ()
	{
		int a =10;
		int b =20;
		int c= 30 ;
		if (a<b && b>c)
		{
			System.out.println("a is gretest number than b and c");
		}
		else 
		{
			System.out.println(" given condition false");
		}
		System.out.println("---------");
	}
	// || OR one condition is true so return result is true 
	
	void method2 ()
	{
		int a=10;
		int b=20;
		int c=30;
		if (a<b || b<c)
		{
			System.out.println(" a is gretest number than b and c");
		}
		else 
		{
			System.out.println("given condition is false");
		}
		System.out.println("-----------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssingmentLogicaloperator obj = new AssingmentLogicaloperator ();
		obj.method();
		
		obj.method1();
		obj.method2();	
		
	}

}
