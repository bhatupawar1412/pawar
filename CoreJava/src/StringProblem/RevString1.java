package StringProblem;

public class RevString1 {
	
	void rev ()
	{
		String s ="pune";
		char c ;
		String rev = " ";
		for (int i =s.length()-1;i>=0 ; i--)
		{
		//	System.out.println(s.charAt(i));
			c = s.charAt(i);
			rev=rev+c;
			//System.out.println(rev);
		}
		 System.out.println(rev);
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RevString1 obj =new RevString1 ();
		obj.rev();
	}

}
