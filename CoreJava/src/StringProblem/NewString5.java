package StringProblem;

public class NewString5 {

	void method ()     // string literal 
	{
		String a = "ABCD";
		String b = "ZYXW";
		System.out.println(a.concat(b));
		
		a =a.concat("BSRP@1234");  // String with concat
		System.out.println(a);
		String p = "radhe radhe";
		String q= "RADHE RADHE";
		String k="viabhya ";
		System.out.println(p.replace("radhe","krishna"));  // replace
		System.out.println(p.charAt(4)); // charAt case
		System.out.println(p.length());  // length case
		System.out.println(k.toUpperCase());  // toUpperCase
		System.out.println(p.toLowerCase());  // toLowerCase
		System.out.println(q.toLowerCase());  // toLowerCase
		
	}
	static void method1()    // string by new key word 
	{
	String a = new String ("frieds series");
	String b = new String ("money heist series");
	System.out.println(a.concat( b));
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewString5 obj =new NewString5 ();
		obj.method();
		NewString5.method1();
	}

}
