package interviewPracticeProgram;

import java.util.Scanner;

public class nonRepeting_StringEx {
	public static String nonRepeatativeChar(String str)
	{
		char P;
		String str1="";
		System.out.print("Non repeatative char are : ");
	    for(int i=0;i<str.length();i++)
	    {
	    	P=str.charAt(i);
	    	int C=0;
	    	for(int j=0;j<str.length();j++)
	    	{
	    		char Q=str.charAt(j);
	    		if(P==Q)
	    		{
	    			C=C+1;
	    		}
	    	}
	    	if(C==1)
	    	{
	    		str1=str1+P;
	    		break;
	    	}
	    }
	    str=str1;
	    return str;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println(nonRepeatativeChar(s.nextLine()));	

		nonRepeting_StringEx obj = new nonRepeting_StringEx();
		obj.nonRepeatativeChar("abcd");
		
	
	
}}
