package ArrayTopics;

public class ArraySingleDimension {
	
	void SingleD ()
	{
		int a[]  = new int [5];
		                     
		a[0] =10;
		a[1] =20;
		a[2] =30;
		a[3] =40;
		a[4] =50;
		
		System.out.println(a.length);
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);  // we have to give the knowledge
			
		}
		System.out.println("----------");
}
	void SinglesD ()
	{
		int a[]  = new int [5];
        
		a[0] =10;
		a[1] =20;
		a[2] =30;
		a[3] =40;
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);  // we have to give the knowledge
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ArraySingleDimension obj = new ArraySingleDimension ();
		obj.SingleD();
		obj.SinglesD();
	}

}
