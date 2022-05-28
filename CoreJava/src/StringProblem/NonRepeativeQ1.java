package StringProblem;

public class NonRepeativeQ1 {

	void m4 ()
	{
		String s1 ="TestData";
		char P ; 
		System.out.print("non repeatative char are : ");
		for (int i=0; i<s1.length(); i++)
		{
			P=s1.charAt(i);
			int c=0;
			for (int j=0; j<s1.length(); j++)
				
			{
				char Q = s1.charAt(j);
				if (P==Q)
				{
					c=c+1; // 2
				}
			}
			if (c==1)
			{
				System.out.print(" "+P);
			}
				
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 NonRepeativeQ1 obj = new  NonRepeativeQ1 ();
		 obj.m4();
	}

}
