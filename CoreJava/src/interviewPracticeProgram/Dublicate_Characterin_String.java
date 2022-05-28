package interviewPracticeProgram;

public class Dublicate_Characterin_String {

	void method()
	{
		String s="maheshbabu";
	int length = s.length();
	char[] c=s.toCharArray();
	for(int i=0; i<length; i++)
	{
		for(int j=i+1; j<length; j++)
		{
			if(c[i]==c[j])
			{
				System.out.println("duplicate charcter are :"+c[j]);
				break;
			}
		}
	}
	}   
	
	public static void main(String[] args) {
		Dublicate_Characterin_String obj= new  Dublicate_Characterin_String();
		
		obj.method();
	}
}
