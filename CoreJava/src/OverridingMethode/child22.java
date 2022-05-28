package OverridingMethode;

public class child22 extends parent22 {


	void method ()
	{
		String s ="smart city pune";
		System.out.println(s);
		
	}
	
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		//child22 obj1 = new child22 ();
		//obj1.method();
		//obj1.method();
		
		// only accesses child class method b'cos overriding method name same
		
	    // child22 obj2 = new parent22 ();
		// this is combination not allow java
		

		//parent22 obj3 = new child22 ();
		//obj3.method();
		//obj3.method();
		// only accesses child class method b'cos overriding method name same
		
		//parent22 obj4 = new  parent22 ();
		//obj4.method();
	   // obj4.method();
	   // only accesses parent class method b'cos overriding method name same
	}

}
