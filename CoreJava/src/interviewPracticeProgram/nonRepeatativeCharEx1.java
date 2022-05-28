package interviewPracticeProgram;

public class nonRepeatativeCharEx1 {
	public static String nonRepeatativeChar(String str)
{
	//int c =0;
for(int i =0; i<str.length(); i++) {
int c =0;
	for(int j=0; j<str.length(); j++) {
		if(str.charAt(i)== str.charAt(j) && i!=j) {
			c=c+1;
}
}
			if(c==0) { 
				System.out.println("First nonrepeating char is " + str.charAt(i));
		break;
}
}
return str;}
	
	public static void main (String[] args)
	{
		nonRepeatativeCharEx1 obj=new nonRepeatativeCharEx1 ();
		obj.nonRepeatativeChar("aabcde");
		}
}

