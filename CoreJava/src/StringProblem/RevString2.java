package StringProblem;

public class RevString2 {

	void revstring ()
	{
		String n ="Bhatu";
		int leng =n.length();
		String rev = "";
		
		for (int i = leng-1; i>=0 ; i--)
		{
			rev =rev+n.charAt(i);
		}
		System.out.println(rev);
		
	}
	void RS()
	{
		String name = "Smart city dhule";
		
		int leng = name.length();
		String rev = " ";
		for (int i=leng-1; i >=0 ; i--)
		{
			rev  = rev +name.charAt(i);
		}
		
		
		System.out.println(rev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RevString2 obj =new RevString2();
              obj.revstring();
              obj.RS();
	}

}
