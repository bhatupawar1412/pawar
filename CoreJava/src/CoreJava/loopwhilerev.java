package CoreJava;

public class loopwhilerev {
	void bhatu () {
		
	int num=12345, rev=0;
		
		
		
		while(num>0)
		{
			int digit = num % 10;
			rev = rev * 10+ digit;
			num=num/10;
			
		}
		System.out.println("reverse num" + rev);
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopwhilerev obj = new loopwhilerev();
		obj.bhatu();
	}

}
