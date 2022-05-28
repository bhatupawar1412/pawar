package OverloadingMethod;

public class overloadingex1 {
	
	public void method (int a, int b)
	{int z=a+b;
		System.out.println(z);
	}
	public void method(String s)
	{
		System.out.println(s);
	}
	public void method(String p,int q)
	{
	
	System.out.println(p+q);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloadingex1  obj= new overloadingex1 ();
		obj.method(40,55);
		obj.method("love u mom");
		obj.method("pawar",40);
		
	}

}
