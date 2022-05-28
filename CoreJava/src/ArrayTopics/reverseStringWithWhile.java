package ArrayTopics;

public class reverseStringWithWhile {

	static void method ()
	{
		String s ="dhule";
		
		char c;
		String rev =" ";
		int i=s.length()-1;
		
		do
		{
			c=s.charAt(i);
					
					rev=rev+c;
			i=i-1; // i-- both condition used 
		}while(i>=0);
		
		System.out.println(rev);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method();

	}

}
