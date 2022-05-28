package StringProblem;

public class String3 {
	static void pawar ()
	{
		String s1 = "Suhas";    
		String s2= "Coforge";  
		System.out.println(s1); // Suhas 
		System.out.println(s2); // Coforge
		
		String s3=s1.concat(s2);  // SuhasSuhas         
		System.out.println(s1); // suhas
		System.out.println(s2); //coforge
		System.out.println(s3); // suhascoforge
		
	}
	
	
	public static void main(String[] args) {
		
		String3.pawar();
		
	}

}
