package CoreJava;

public class forloopreversenumber {    //for loop reverse number
	
	void bhatu()
	{
		
		int rev=0;
		
		for (int n=1234;n!=0; n=n/10)
		
		{
			int digit = n%10;
			
			
			rev =rev *10+digit;
		}
		
		System.out.println("reverse number is"  + rev);
		
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		forloopreversenumber obj = new forloopreversenumber();
		obj.bhatu();

	}

}
