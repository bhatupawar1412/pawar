package StringProblem;

public class classImmultable {

	static void md ()
	{
		String s1 = "devi";
		String s2 = "manu";
		
		System.out.println(s1.concat(s2));
		s1.concat("pawar");// no changeable 
	
		s1=s1.concat("bhatu"); // changeable 
		System.out.println(s1);
		
	}


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		classImmultable . md();

	
		
	}

}
