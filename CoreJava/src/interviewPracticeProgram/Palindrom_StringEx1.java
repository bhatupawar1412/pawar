package interviewPracticeProgram;

public class Palindrom_StringEx1 {
public static void main(String[] args) {
	
	String s="nayan";
	String rev="";
	char c;
	for(int i=s.length()-1; i>=0; i--)
	{
		c=s.charAt(i);
		rev=rev+c;
		
	}
	System.out.println("palindrom :" +rev);
}
}
