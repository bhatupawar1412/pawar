package interviewPracticeProgram;

public class Reverse_String {

	
	public static void main(String[] args) {
		
		String s="bhatu";
		String rev="";
		char c;
		
		for(int i=s.length()-1; i>=0; i--)
		{
			c=s.charAt(i);
			rev=rev+c;
			
		}
		System.out.println("Reverse :"+rev);
	}
	
	
}
