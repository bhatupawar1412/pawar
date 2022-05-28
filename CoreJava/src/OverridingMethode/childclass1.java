package OverridingMethode;

public class childclass1 extends parentclass1  {
	
// static void mathsoperation () //error show
//private void mathsoperation ()	 //error show
	
	void mathsoperation ()
	{
		int a=100;
		int b=50;
		int sub=a-b;
		System.out.println(sub);
	}
	
	public static void main(String[] args) {
		
		childclass1 objA = new childclass1();
		parentclass1  objB =new childclass1();
		parentclass1 objC = new parentclass1 ();
		
		
		// childclass1 objD =new parentclass1 ();
        // this is combination not allow java
		
		objA.mathsoperation (); // sub
		objB.mathsoperation (); // add
		objC.mathsoperation (); //sub
	}

}
