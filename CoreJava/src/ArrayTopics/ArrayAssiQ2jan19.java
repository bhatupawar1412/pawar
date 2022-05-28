package ArrayTopics;

public class ArrayAssiQ2jan19 {
	
	void leftsidezero ()
	{
		int arr[] = {1,0,11,0,1,0,0};
		
		int leng = arr.length;
		int count =0;
		
		for (int i =0; i<leng;i++)
		{
			if (arr[i]!=0)
			{
				arr[count++] = arr[i];
			}}
		while (count<leng)
		{
			arr [count++] = 0;
		}
		for (int j= 0; j<leng; j++ )
		{
			System.out.print(arr[j] +" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayAssiQ2jan19 obj = new ArrayAssiQ2jan19 ();
		obj. leftsidezero();
	}

}
