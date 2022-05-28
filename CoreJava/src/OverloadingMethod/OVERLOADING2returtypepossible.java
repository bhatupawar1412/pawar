package OverloadingMethod;

public class OVERLOADING2returtypepossible {
	
	// return type possible same method name void convert to data type 
	
	int m1 ()
	{
		int i = 100 ;
		System.out.println(i);
		return i;
	}
	int m1 (int x , int z )
	{
		System.out.println(x+z);
		return x+z;
	}
	String m1 ( int p , String q)
	{
		String a = p+q;
		System.out.println(a);
		return a;
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		OVERLOADING2returtypepossible  obj = new OVERLOADING2returtypepossible ();
		obj.m1 ();
		obj.m1(100,200);
		obj.m1 (444 ,  "pawar");
		
	}

}
