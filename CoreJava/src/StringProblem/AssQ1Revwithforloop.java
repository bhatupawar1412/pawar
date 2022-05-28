package StringProblem;

public class AssQ1Revwithforloop {

	static // reverse the give String using for loop
	
	void reverse ()
	{
		String s = "test Data";
		char a ; 
		 String rev = "";
		 
		 for (int b=s.length()-1; b>=0; b-- )
		 {
			 a=s.charAt(b); // a+t+a+D t+s+e+t
			 
			 rev=rev+a;     // ataD tset 
			 
			}
		System.out.println(rev);
		
	}

	public static void main(String[] args) {
	
		AssQ1Revwithforloop.reverse ();

	}

}
