package Oops;

public class child11 extends parent11 {

  void childmethod1 ()
	{
		
		int[] a= {10,20,30,40};
		
		int i;
		for(i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child11 obj1 = new child11 ();
		obj1.childmethod1();
		obj1.parentdmethod1();
		obj1.parentOfparentmethod();
		
		//we can access the method is from child class ,parent class & parent of parent
		
		parent11 obj2 = new parent11 ();
		
		obj2.parentdmethod1();
		obj2.parentOfparentmethod();
		
		//we can access the method is from parent class & parent of parent
		
		parentOFparent11 obj3 = new parentOFparent11 ();
		
		obj3.parentOfparentmethod();
	// only parentOfparent access 
		
	//	child11 obj4 = new parent11 ();
	// this is combo not allow java
		
	//child11 obj5 = new parentOFparent11 (); 
	// this is combo not allow java
		
		
	//parent11 obj6 = new parentOFparent11 (); 
	// this is combo not allow java
		
		parent11 obj7 = new child11 ();
		obj7.parentdmethod1();
		obj7.parentOfparentmethod();
		//we can access the method is from parent class & parent of parent
		
		parentOFparent11 obj8 = new child11 ();
		obj8.parentOfparentmethod();
		// only parentOfparent access
		
		parentOFparent11 obj9 = new parent11 ();
		obj9.parentOfparentmethod();
		// only parentOfparent access
		
		
		
		
		
	}

}
