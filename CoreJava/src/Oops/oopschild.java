package Oops;

public class oopschild extends oopsparent {
	
	// int a =100;  // global variable 
	// static int aa = 200;
  void mchild (int[] a)
{
	//int a=10;    // local variable
   // System.out.println(a);
	
	// System.out.println(a); // global a declare
	 
	// System.out.println(aa);
	 //final int aa1 =310;        // final variable 
	// System.out.println(aa1);
	 
	 // int a2 = 1010;  //public,private , protected variable error show Illegal modifier for parameter s; only final is permitted
	// System.out.println(a2);
	  

	//	int[] a = {1,2,3,4}; // parameter pass
		
		
		for (int i:a)
		{
			System.out.println(i);
		}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// *** local variable ***
		
	//	oopschild obj =new  oopschild();
		// obj.mparent();
		// obj.mchild();
//we can access method from child class as well as from parent class
		
		// ------------------------------------------------------
      // oopsparent obj1 = new oopsparent();
	//	obj1.mparent();
		
		// we can access methods from parent class only
		//--------------------------------------------------------
	//	oopsparent obj2 = new  oopschild();
	//	 obj2.mparent();
		
		// we can access methods from parent class only
		//--------------------------------------------------------
		// oopschild obj3=new oopsparent();
		// this combination is not allow in java
		//------------------------------------------------------------------
//=============================================================================
		// ***** global variable **** 
		//oopschild obj =new  oopschild();
		// obj.mparent();
		// obj.mchild();
		//we can access method from child class as well as from parent class
		// ---------------------------------------------------------------------
		// oopsparent obj1 = new oopsparent();
			//	obj1.mparent();
				
				// we can access methods from parent class only
	//-------------------------------------------------------------------------------
			//	oopsparent obj2 = new  oopschild();
			//	 obj2.mparent();
				
				// we can access methods from parent class only
	//-----------------------------------------------------------------------------
				// oopschild obj3=new oopsparent();
					// this combination is not allow in java
 //=====================================================================================
				 //*** staic variable ***
				 
	//	oopschild obj1 =new  oopschild();
	//	 obj1.mparent();
	//	 obj1.mchild();
		//we can access method from child class as well as from parent class
	// -------------------------------------------------------------------------------			 
	//	 oopsparent obj2 = new oopsparent();
	//			obj2.mparent();
				
				// we can access methods from parent class only
//----------------------------------------------------------------------------------	
		//		oopsparent obj3 = new  oopschild();
			//	 obj3.mparent();
				
				// we can access methods from parent class only
	//----------------------------------------------------------------------			 
				// oopschild obj4=new oopsparent();
					// this combination is not allow in java
	//=================================================================================
	        // *** final variable ***
		//oopschild obj =new  oopschild();
	//	 obj.mparent();
		// obj.mchild();
//we can access method from child class as well as from parent class
	// final method & varible both access 	
	//-----------------------------------------------------------------------------------	
		
		// oopsparent obj1 = new oopsparent();
			//	obj1.mparent();
				
				// we can access methods from parent class only
//---------------------------------------------------------------------------------
				//oopsparent obj2 = new  oopschild();
			//	 obj2.mparent();
				 
					// we can access methods from parent class only
 //---------------------------------------------------------------------------
				// oopschild obj3=new oopsparent();
					// this combination is not allow in java
//====================================================================================		 
	               //** public method **
		
		// oopschild obj1 =new  oopschild();
			// obj1.mparent();
		//	 obj1.mchild();
			//we can access method from child class as well as from parent class
	//---------------------------------------------------------------------------
			// oopsparent obj2 = new oopsparent();
							// obj2.mparent();
							 
		// we can access methods from parent class only
	//-------------------------------------------------------------------------
		// oopsparent obj3 = new  oopschild();
		//	 obj3.mparent();
			 
				// we can access methods from parent class only
	//------------------------------------------------------------------------------		 
		// oopschild obj3=new oopsparent();
		// this combination is not allow in java
		//=============================================================================
	// *** private method ***
		// oopschild obj1 =new  oopschild();
		
		// obj1.mchild();
		//we can access method from child class only
	//-------------------------------------------------------------------------------
		// oopsparent obj2 = new oopsparent();
		// obj2.mparent();
		//	 obj2.mchild();
			// no access method from child class  as wll as class parent 
	
	//-----------------------------------------------------------------------------
		// oopsparent obj3 = new  oopschild();
		//	 obj3.mparent();
		//	 obj3.mchild();
			// no access method from child class  as wll as class parent
	
	//--------------------------------------------------------------------------------
		//       oopschild obj3=new oopsparent();
				// this combination is not allow in java
//============================================================================
		// **protected method **
		
	//	oopschild obj1 =new  oopschild();
	//	 obj1.mparent();
	//	 obj1.mchild();
		//we can access method from child class as well as from parent class
		
//--------------------------------------------------------------------------------		
	  //	 oopsparent obj2 = new oopsparent();
	  //	obj2.mparent();
		
      // we can access methods from parent class only
		
//------------------------------------------------------------------	
		
	    // oopsparent obj3 = new  oopschild();
		// obj3.mparent();
				 
	 // we can access methods from parent class only
//------------------------------------------------------------------------------		 
				
	   	// oopschild obj4=new oopsparent();
	   // this combination is not allow in java
		
//=============================================================================
		// ** static method **
		
	//	oopschild obj1 =new  oopschild();
	//		 obj1.mparent();
	//		 obj1.mchild();
	//we can access method from child class as well as from parent class
//----------------------------------------------------------------------	
		
	   //	oopsparent obj2 = new oopsparent();
	  //		obj2.mparent();
		
	 // we can access methods from parent class only	
//-----------------------------------------------------------------------
		
	     //	 oopsparent obj3 = new  oopschild();
	    //	obj3.mparent();
	    // we can access methods from parent class only
		
		
		  // oopschild obj4=new oopsparent();
	   // this combination is not allow in java
//=======================================================================
		
		        //** final method **
		
	        // 	oopschild obj1 =new  oopschild();
			//	 obj1.mparent();
			//	 obj1.mchild();
	        //we can access method from child class as well as from parent class

		
	     //	oopsparent obj2 = new oopsparent();
	     //	obj2.mparent();
				 
	     //we can access methods from parent class only	
			
		
	     //	 oopsparent obj3 = new  oopschild();
		//	 obj3.mparent();
	   // we can access methods from parent class only
				
	

		// oopschild obj4=new oopsparent();
				// this combination is not allow in java
//=================================================================================
		    //** public variable **
	//	oopschild obj1 =new  oopschild();
	//	 obj1.mparent();
	//	 obj1.mchild();
    // error Unresolved compilation problem: 
//=====================================================================================
		
	             // ** parameter pass **
		
		oopschild obj1 =new  oopschild();
		obj1.mchild(new int []{1,2,3,4});
		obj1.mparent(new int []{10,20,30});
		//we can access method from child class as well as from parent class
		 
		oopsparent obj2 = new oopsparent();
		obj2.mparent(new int [] {10,20,30});
		// we can access methods from parent class only
		
		//oopschild obj3 =new oopsparent();
		// this is combination java not allow
		
		oopsparent obj4 = new oopschild();
		obj4.mparent(new int [] {10,20,30});
		// only access mparent method
//=====================================================================================		
		
	}

}
