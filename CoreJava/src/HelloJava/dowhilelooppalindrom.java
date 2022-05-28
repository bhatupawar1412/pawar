package HelloJava;

public class dowhilelooppalindrom {
	void bhatu()
	{
		int a= 12321;
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
		// TODO Auto-generated method stub
		dowhilelooppalindrom obj = new dowhilelooppalindrom();
		obj.bhatu();
	}

}
