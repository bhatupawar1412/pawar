package ArrayTopics;

public class a1 {

	void m()
	{
		int arr[] = {1,5,8,3,4};
		
		int min = arr[0];
		
		for (int i=0; i<arr.length; i++)
		{
			if (arr[0]<min)
			{
				min=arr[0];
			}
		}
System.out.println("smallest number " +min);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a1  obj = new a1 ();
		obj.m();
	}

}
