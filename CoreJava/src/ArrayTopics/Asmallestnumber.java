package ArrayTopics;

public class Asmallestnumber {
	
	void array ()
	{
		
		int a[]  = {5,8,9,1,4,7,2,3};
		
		int min = a[0];
		
		for (int i=0; i<a.length; i++)
		{
			if (a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println(" Smallest number " + min);
		}
	
	// Descending order array 
	
	void descending ()
	{
		int b[] = {9,2,8,3,5,7,4,1,6};
		
	System.out.println("descending array is");
		
	for (int i=0; i<b.length; i++)
	
	{
      for ( int j=i+1; j<b.length; j++)
      {
    	  if(b[i]<b[j])
    	  {
    		  int min =b[i];
    				  b[i]=b[j];
    						  b[j]=min;
    	  }
      }
      System.out.print(b[i] + " ");
	}
	
	
	
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asmallestnumber obj = new Asmallestnumber ();
		obj.array();
		obj.descending();
		
		
	}

}
