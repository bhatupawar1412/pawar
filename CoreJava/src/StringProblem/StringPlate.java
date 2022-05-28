package StringProblem;

public class StringPlate {
	
	void split ()
	{
	// by using equals 
		
		String a1 = "vishal";
		String  a2= "vishal";
		String a3 = "bhatu";
		String a4 = new String("vishal");
		String a5 = new String ("vishal");
		System.out.println(a2.equals(a4));//f
		
		System.out.println("=========");
		System.out.println(a1==a2); // t
		System.out.println(a1==a3);// f
		System.out.println(a1==a4);// f
		System.out.println(a4==a5);// 
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPlate obj = new StringPlate ();
		obj . split ();
		
	}

}
