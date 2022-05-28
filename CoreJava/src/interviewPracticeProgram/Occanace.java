package interviewPracticeProgram;

import java.util.HashMap;

public class Occanace{
	
public static void main(String[] args) {
	String str = "accelaration";
	char[] ar=str.toCharArray();		
	
	HashMap<Character,Integer>count= new HashMap<Character,Integer>();
	for(char d:ar)
	{
		if(count.containsKey(d))
		{
			count.put(d, count.get(d)+1);
		}
		else
		{
			count.put(d, 1);
		}
		
	}
	System.out.println(count);
	
	
}
}
