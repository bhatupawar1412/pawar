package StringProblem;

public class StringIndexOf {
	
	void method ()
	
	{
		String a = "bhatupawar";
		String b= "testdata";
		System.out.println(b.charAt(0));
		System.out.println(b.indexOf("t"));
		System.out.println(a.indexOf("t"));
		System.out.println(a.indexOf("D"));
		System.out.println(a.indexOf("t"));
		System.out.println(a.indexOf("at"));
		System.out.println(a.indexOf("ata"));
		System.out.println(b.indexOf("ata"));
	}
public static void main(String[] args) {
	
	StringIndexOf o = new StringIndexOf ();
	o.method ();
	
}
}
