package interviewPracticeProgram;

public class Max_NumberEx1 {
	public static void main(String[] args) {
//
//		int[] array = { 1, 45, 69, 98 };
//
//		int max = Integer.MIN_VALUE;
//		for (int ele : array) {
//			if (ele > max) {
//				max = ele;
//			}
//			
//		}
//		System.out.println(max);
		
	//-----------------------------------------
		int []ar= { 1, 45, 69, 98 };
		
		int min=Integer.MAX_VALUE;
		for(int element : ar)
		{
			if(element<min)
			{
				min=element;
				
			}
		}
		System.out.println("min "+min);
		
	}
}
