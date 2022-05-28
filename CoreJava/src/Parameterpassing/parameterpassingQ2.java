package Parameterpassing;

public class parameterpassingQ2 {

	void method (String p , String q) 
	{
		if (p==q)
		{
			System.out.println("is same value p and q");
		}
		else {
			System.out.println("not same value p and q");
		}
	}
	

	void method1 (int x , int z) 
	{
		if (x==z)
		{
			System.out.println("is same value x and z");
		}
		else {
			System.out.println("not same value x and z");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameterpassingQ2 obj = new parameterpassingQ2();
		obj.method("bhatu", "bhatu");
		obj.method1(100,400);
	}

}
