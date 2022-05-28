package HelloJava;

public class dowhilelooprev {
	
	void bhatu()
	{
		int a= 123456789;
		int reverse = 0;
		int last = a%10;
		do
		{
			last = a%10;
			reverse =reverse*10+last;
			a/=10;
			
		}
		while(a>0);
		
		System.out.println("palindrom num"    + reverse);
	}
	public static void main(String[] args) {
		
		dowhilelooprev obj = new dowhilelooprev();
		obj.bhatu();
		
	}
	
	
	
	
	

}
