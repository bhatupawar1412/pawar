package ArrayTopics;

public class AEX1 {

	void m ()
	{
		int[] a = {10,20,30,40};
		
		{
			System.out.println(a[3]);
		}
		
		System.out.println("----------");
	}
	
	
	
	void m1 ()
	{
		int[] a =new int[5];
		
		a[0] =100;
		a[1] =200;
		a[2]=300;
		a[3]=400;
		a[4]=700;
		
		for (int i=0; i<5; i++)// then for (int i=0; i<a.length ; i++)
		{
			System.out.println(a[i]);
		}
				System.out.println("-------------");
	}
	
	
	void m2 ()  // for each loop 
	{ 
		int[] number = {1,2,3,5,4};  // syntax (datatype : array name )
		
		System.out.println(number.length);
		for (int i : number)
		{
			System.out.println(i);
		}
		System.out.println("----------");
		
	}
	
	void m3 ()      // reverse
	{
		int[] number = {1,2,3,4,5};
		{
			for (int i =number.length-1; i>=0; i--)
			{
				System.out.print(number[i]);
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AEX1 o = new AEX1 ();
	//	o.m();
	//	o.m1();
	//	o.m2();
		o.m3();
		
	}

}
