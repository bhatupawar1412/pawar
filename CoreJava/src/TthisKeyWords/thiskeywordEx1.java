package TthisKeyWords;

public class thiskeywordEx1 {

	int b =1000;
	int a =100;
	String s ="bhatu";
	
	void method (String s )
	{
		
		System.out.println(this.s);//bhatu
		this.s=s;
		
		System.out.println(s); //pawar
		System.out.println(s); //pawar
		
		int a=500;
		System.out.println(a);
		System.out.println(this.a);
		
		
	}
	
	void method1 ()
	{
		int b =200;
		System.out.println(this.b);//1000
		this.b=b;
		System.out.println(b);//200
		System.out.println(b); //200
		
		
	}
	
int i;
	
	void m1(int x)
	{
		i=x;
		System.out.println(i);//10
	}
	void m2()
	{
		System.out.println(i); // 10
	}
int y;
	
	void m3(int y)
	{
		y=y;
		
	}
	void m4()
	{
		System.out.println(y);// o b'cos same variable 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thiskeywordEx1 obj =new thiskeywordEx1 ();
		//obj.method("pawar");
		//obj.method1();
		obj.m1(10);
		obj.m2();
		obj.m3(10);
		obj.m4();
	}

}


