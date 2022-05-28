package StringProblem;

public class String1 {

	void Stringname ()
	{
		String a = "Bhatu";
		System.out.println(a);
		String b="Bhatu";
		System.out.println(b);
		a.concat("pawar"); // no result print b'cos immutable 
		System.out.println(a);
		}
	void Stringname1 ()
	{
		String a = "Bhatu";
		System.out.println(a);
		String b="Bhatu";
		System.out.println(b);
		
		a=a.concat("pawar");
		System.out.println(a);  // Fearfully done here with concat 
		
		// result in store String2 class same package aahe 
	}
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		String1 obj = new String1();
		obj.Stringname();
	
		
	}

}
