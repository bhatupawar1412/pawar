package Oops;

public class parentOFparent11 {

	 void parentOfparentmethod ()
	{
		
		String s ="dhule";
		
		String rev =" ";
		
		char c;
		
		for(int i=s.length()-1; i>=0; i--)
		{
			c=s.charAt(i);
			
			rev=rev+c;
			
		}
		System.out.println(rev);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}

}
