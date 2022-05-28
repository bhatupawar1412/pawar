package StringProblem;

public class StringCompare {
	
	void method ()
	{ // by using equal string
		String s1 = "suhas";
		String s2 = "suhas";
		
		String s3 = new String ("suhas");
		String s4 = new String ("suhas");
		String s5 = "bhatu";
		String s6 = new String ("bhatu");
		System.out.println(s1.equals(s2));// true
		System.out.println(s2.equals(s2)); // true
		System.out.println(s3.equals(s4)); //true
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1.equals(s5)); // false
		System.out.println(s3.equals(s6)); // false
		
		System.out.println("----------");
		
		// by using == operator
		
		System.out.println(s1==s2); // true
		System.out.println(s2==s1);// true
		System.out.println(s3==s4); //false
		System.out.println(s1==s3); // false
		System.out.println(s2==s4); // false
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompare obj= new StringCompare ();
		obj.method ();
		
	}

}
