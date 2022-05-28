package Assingnment;

 

public class Assingnment4 {

	void addi ()
	{
		int a= 10 ;
		int b=20 ;
		System.out.println(a+b);
	}
	void sub ()
	{
		int a=10;
		int b  = 20;
		int sub = a-b;
		System.out.println(sub);
	}
	void divi ()
	{
		int a=40;
		int b  = 20;
		int divided = a/b;
		System.out.println(divided);
	}
	void compare  ()
	{

		int a=10;
		int b  = 20;
		
		System.out.println(a==b);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assingnment4 obj = new Assingnment4 ();
		obj.addi();
		obj.sub();
		obj.divi();
		obj.compare();
	}

}
