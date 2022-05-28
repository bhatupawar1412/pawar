package StringProblem;

public class JSLK {
	static void radhe ()
	{
  
		String a = "abcde";
		char c ;
		String rev="";
		for (int i=a.length()-1; i>=0 ; i-- )
		{
			c=a.charAt(i);
			rev=rev+c;
		}
		System.out.println(rev);
 }

		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSLK o = new JSLK ();
		o.radhe ();
		
				
	}

}
