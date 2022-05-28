package ArrayTopics;

public class ArrayEX1 {

	void method ()
	{
		int[] number = {10,11,15,14};
		            //   0  1  2  3
		
	System.out.println(number [2]);
	System.out.println("----------");		
	}
	void m1 ()
	{
		int[] age = new int [3];
		age[0]  = 10;
		age[1]  = 20;
		age[2]  = 30;
		
		for (int i=0; i<age.length; i++)  // for loop
		{
		System.out.println(age[i]);	// we have to give the knowledge of value
		}
	}
	
	public static void main(String[] args) {
		ArrayEX1 obj = new ArrayEX1 ();
		obj.method();
		obj.m1();
	}
}
