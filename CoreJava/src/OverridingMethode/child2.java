package OverridingMethode;

public class child2 extends parent2  {
	
	void method1 ()
	{
		
		int[] a = {10,20,30};
		
		int i=0;
		 while (i<a.length)
		 {
			 System.out.println(a[i]);
			 i=i+1; // i++ both condition used 
		 }
		
	}
	
public static void main(String[] args) {
	
	child2 objA = new child2 ();
    parent2 objB = new child2 ();
	parent2 objC = new parent2 ();
	
	// child2 objA = new parent2 ();
	objA.method1 ();
	objB.method1 ();
	objC.method1 ();
}
}
