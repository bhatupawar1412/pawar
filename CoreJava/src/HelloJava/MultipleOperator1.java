package HelloJava;

public class MultipleOperator1 {

	void method()
	{
	int x = 10;
	int y = 20;
	int z=30; 
		
	if (x<y || x<z)       // || pipe  both condition is true or one condition is true. 
	{
		System.out.println("m number smaller than n and l");
		
	}
	else {
		System.out.println("given is false");
	}
		}
	void oror()
	{
	int a = 10;
	int b = 30; 
	int c= 40;
	
	if (a>b || a<c)
	{
	System.out.println("a is smaller number than b and c ");	
	}	
	else {System.out.println("given is false");
		
	}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleOperator1  obj = new MultipleOperator1 ();
		obj.method();
		obj.oror();
	}

}
