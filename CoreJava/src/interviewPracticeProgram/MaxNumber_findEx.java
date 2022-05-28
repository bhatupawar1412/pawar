package interviewPracticeProgram;

public class MaxNumber_findEx {

	public static void main(String[] args) {

		int[] array = { 1, 45, 67, 98, 455, 678 };

		int max=Integer.MIN_VALUE;
		for(int ele : array)
		{
		if(ele>max)
		{
			max=ele;
		}
		}
		System.out.println("Max Element is " +max);

	//-------------------------------------------------
	
		int [] ary= {1, 45, 67, 98, 455, 678 };
		
		int min=Integer.MAX_VALUE;
	
		for(int element : ary)
		{
			if(element<min)
			{
				min=element;
			}
			
		}
	System.out.println(min);
	}

}
