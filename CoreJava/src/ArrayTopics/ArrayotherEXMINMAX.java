package ArrayTopics;

public class ArrayotherEXMINMAX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,45,67,98,455,678,-6};
		int min = Integer.MAX_VALUE;
		
		for (int element : arr)
		{
			if (element <min)
			{
				min=element;
			}
		}
		
		System.out.println("Min element is " + min);
		//-------------
int arr1[] = {5,8,1,3,4};
		
		
		int smallest = Integer.MAX_VALUE;
		
		for (int number : arr1)
		{
			
			if (number <smallest)
			{
				smallest=number;
			}
		}
		
		System.out.println(smallest);
		
	}

}
