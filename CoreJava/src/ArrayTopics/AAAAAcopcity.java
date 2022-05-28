package ArrayTopics;

public class AAAAAcopcity { // constructor with array solve problem

	AAAAAcopcity ()
	{ 
        String [] city = {"pune","mumbai","dhule","jalgoan"};
        
        for (String s : city)
        {
        	System.out.println(s);
        }
        System.out.println("----------------------");
		}
	
	void pp ()
	{
		String[] s = {"pune","mumbai","dhule","jalgoan"};
		
		for (String a : s)
		{
			if ("mumbai".equals(a))
			{
				System.out.println("its present");
			}
			else 
			{
				System.out.println("not present");
			}
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAAAAcopcity obj = new AAAAAcopcity ();
		obj.pp();
	}

}
