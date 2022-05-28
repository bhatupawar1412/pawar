package HelloJava;

public class MultipleOperator {

	void andand()
	{
		int m = 20;
		int n = 30;
		int l = 40;  // && and multiple operator
		
		{
			if (m<n && m<l)
			{
				System.out.println("m number smaller than n and l");
				
			}
			else {
				System.out.println("given is false");
			}
			
		}	
	}
	void bhatuand ()                      // both is condition true 
	{
		int a = 50;
		int b = 60;
		int c = 70;
		
		if (a<b && a>c)
		
		{
			System.out.println("m number smaller than n and l");
		}
		else {
			System.out.println("given is false");
		}
	}
	void pawar () {
		int a = 50;
		int b = 60;
		int c = 70;
		
		if (a>b && a>c)
		
		{
			System.out.println("m number smaller than n and l");
		}
		else {
			System.out.println("given is false");
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleOperator obj = new MultipleOperator();
		obj.andand();
		obj.bhatuand();
		obj.pawar();
	}

}
