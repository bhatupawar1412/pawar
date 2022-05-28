package StringProblem;

public class revstring3 {

	
	void mi ()

	{
		String a = "dhule"; // length 5 but char 0 to 4  
		char b ;
		String rev = "";
		for (int i =a.length()-1; i>=0 ; i --)
		{
			
			b=a.charAt(i); // eluhd
		rev=rev+b;  // u+l+u+h+d
			
		}
		System.out.println(rev);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revstring3 obj = new revstring3 ();
		 obj.mi();
	}

}
