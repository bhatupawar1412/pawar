package StringProblem;

public class ReplaceString {

	void method ()
	{
		String a ="this is automation class";
		 a=a.replace("is", "are"); // this are automation class  (result)
		//a=a.replace(" is " , " are "); // both results check
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceString o = new ReplaceString ();
		o.method();
	}

}
