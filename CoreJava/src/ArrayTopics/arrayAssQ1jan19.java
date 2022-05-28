package ArrayTopics;

public class arrayAssQ1jan19 {

	// 1.given array arr[] ={5,8,1,3,4} and your task is to find the smallest
	// element in the given array.
	void method ()
	{
		int[] arr = {5,8,1,3,4};
		
		int min = arr[0];
		
		for (int i=0; i<arr.length; i++)
		{
			if( arr[i]<min)
			{
				min=arr[i] ;
			}
			
		}
		System.out.println("smallest number " + min);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 arrayAssQ1jan19 obj = new  arrayAssQ1jan19();
		 obj.method();
		
		
		
		
		
		
		
		
		
		
	}

}
