package Parameterpassing;

public class parameterQ1 {
	void bhatu (String a, String b)
	{
		for (int i=1; i<=10; i++)       // wrong way problem solve
			if (i%2==0)
		{	
			
			System.out.println(a+i);
		
		}
		else {
			
			System.out.println(b+i);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		parameterQ1 obj = new parameterQ1 ();
		obj.bhatu("even number", "odd number");
	}
}
