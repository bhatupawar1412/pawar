package Assingnment;

public class AssingmentQ3reverseandpalindrom {

	void RP ()
	{int i =1;
		int number = 12345;
		int rev =0;
		int last = number %10 ;
		while (number>0)
		{
			last = number%10;
			rev=rev*10+last;
			number /= 10;
		}
		
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssingmentQ3reverseandpalindrom obj = new AssingmentQ3reverseandpalindrom ();
		obj.RP();
	}

}
