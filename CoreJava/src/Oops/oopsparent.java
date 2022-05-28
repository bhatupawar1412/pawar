package Oops;

 public class oopsparent  {
	
	// int b=101;  // global variable
  // static int bb =201;
	 void mparent (int [] a)
	{
		// int a=100;    // local variable
    // System.out.println(a);	
		// System.out.println(b);
		 //System.out.println(bb);
		
	//   final String name ="bhatu";  // final variable
	//	System.out.println(name);
		//String s="smart city dhule";//public ,private ,protected variable error show Illegal modifier for parameter s; only final is permitted
		//System.out.println(s); 

		 // int [] a = {10,20,30};// parameter pass
		 
		 for (int i : a)
		 {
			 System.out.println(i);
		 }
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	oopschild obj =new  oopschild();
	// 	obj.mparent();
		 // obj.mchild();
		
//we can access method from child class as well as from parent class
		//then
	//	oopsparent obj1 = new oopsparent();
	//	obj1.mparent();
		// we can access methods from parent class only
		//---------------------------------------------------
	//	oopsparent obj2 = new  oopschild();
	//	obj2.mparent();
		
		// we can access methods from parent class only
		//--------------------------------------------------
		// oopschild obj3=new oopsparent();
				// this combination is not allow in java
	//=============================================================
		//*** staic variable ***
		 
		//oopsparent  obj1 =new oopsparent ();
	//	obj1.mparent();
	// ==========================================================================
		//** final variable **
		// oopsparent  obj1 =new oopsparent ();
			// obj1.mparent();
	
	//================================================================================
		// ** public method **
	
	//	oopsparent  obj1 =new oopsparent ();
	//	 obj1.mparent();
	//=========================================================================	
		//** private **
		// oopsparent  obj1 =new oopsparent ();
		//	 obj1.mparent();
		//======================================================================
		// **protected method **
		
		//	oopschild obj1 =new  oopschild();
		//	 obj1.mparent();
		//	 obj1.mchild();
			//we can access method from child class as well as from parent class
	//===========================================================================	
		// ** static method **
		
	//	oopschild obj1 =new  oopschild();
	//		 obj1.mparent();
	//		 obj1.mchild();
			//we can access method from child class as well as from parent class
	//=============================================================================	
		//** final method **
	//----------------------------------------------------------------	
		// parameter method 
		
		// oopsparent obj = new oopsparent();
		
		//obj.mparent(new int []{10,20,30});
	}
	

}
