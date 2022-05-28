package StringProblem;

public class revwhileloopAQ2 {
	
	// reverse with while 
	void mi ()
	{
		String s ="Test Data";
		char c ;
		String rev ="";
		int i = s.length();
		
while (i>0)   // 9 8
	
{
	 i--;  // 9-1 8-1
	 
c=s.charAt(i);  // 8 7

     rev=rev+c;  // a + t    recycle process
 
}

	System.out.println(rev);
	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		revwhileloopAQ2 oo = new revwhileloopAQ2 ();
		
		oo.mi();
		
		
	}

}
