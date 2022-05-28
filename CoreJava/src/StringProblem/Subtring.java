package StringProblem;

public class Subtring {
	
	void subtring1 ()
	// startIdex
	// StartIndex=EndIndex
	// EndIndex-1
	{
	    String S1 = "this is test data";
	    
	    System.out.println(S1.substring(4));
	    
	   System.out.println(S1.substring(6));
	   
	    System.out.println(S1.substring(5,12));
		
	}
	void trim ()   // trim is start space and last space remove 
	{
		String a = " this is test data ";
		String b = "this is test data";
		String c =a.trim ();
		System.out.println(c.length()); // start space and  last space remove 
		System.out.println(a.length());
		System.out.println(a);
		System.out.println(b);

	}
	void concatenation ()
	{
		// concat() combine two string 
	//  by using + operator and by using concat  ()
		
		String a1 = "bhatu";
		String a2 = "pawar";
		System.out.println(a1.concat(a2));
		
		String a3 = a1+a2;
		System.out.println(a3);
		
		String a4 = "bhatu" + "pawar";
		System.out.println(a4);
		
	}
	void charAtMethod ()
	{
		// the charAt gives value at specified index of string 
		// start index 0 1 2 3 ....
		
		String a = "this is test data";
		String b = " this is test data ";
		String c=" bhatu ";
		String d = "bhatu";
		System.out.println(c.charAt(3));
		System.out.println(d.charAt(3));

		System.out.println(a.charAt(6));
		System.out.println(b.charAt(6));
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subtring o = new Subtring();
		o.subtring1();
		o.trim ();
		o.concatenation();
		o.charAtMethod(); 
		
	}

}
