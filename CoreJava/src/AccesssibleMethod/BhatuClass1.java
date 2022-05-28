package AccesssibleMethod;

public class BhatuClass1 {
	public void addition ()
	{
		int p=14;
		int q=12;
		int a=p+q;
		System.out.println("addition" + a);
		}
	void multi()   // default 
	{
		int p=14;
		int q=12;
		int a=p*q;
		System.out.println("multi "+ a);
	}
	private void subtraction ()
	{
		int p=14;
		int q=12;
		int a=p-q;
		System.out.println("sub "+ a);
		}
	protected void floatnumbers()
	{
		float a =14.12f;
		System.out.println("float "+a);
	}
	public static void main(String[] args) {
	BhatuClass1 obj = new BhatuClass1 ();  // calling private method
		obj.subtraction();

		
		
		
	}

}
