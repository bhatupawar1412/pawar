package StringProblem;

public class String5withlength {

	void methodwithlength ()
	{
		String a = "bhatu";
		String b = "I am learnimg core java"; // char with space calculate
		
		System.out.println(a.length());
		System.out.println(b.length());
	}
	void methodtrim ()
	{
		String a = "bhatu";
		String b = "I am learnimg core java"; 
		String c = a.trim();
		System.out.println(a);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String5withlength obj = new  String5withlength ();
		obj.methodwithlength();
		obj.methodtrim();
		
	}

}
