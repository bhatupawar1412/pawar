package ArrayTopics;

public class arraywithForEachLoop {

	void m1 ()
	{
		int[] number = {10, 11, 15, 14};
		
		// for (datatype variable : arrayname )
		
		for (int x : number)  // for each loop 
		{
			
			System.out.println(x); 
			
		}
		System.out.println("----------");
	}
	void m2 ()
	{
		int[] number ={100,200,300,400};
		
		for (int i=0 ; i<number.length ; i++)
		{
			System.out.println(number[i]);
			
		}
		
		
	}
	
	
	private void i() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraywithForEachLoop oo = new arraywithForEachLoop ();
		oo.m1();
		oo.m2();
	}

}
