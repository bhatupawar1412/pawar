package ArrayTopics;

public class aaaa {
static void pp ()
{
	int [] arr = {9,7,8,6,11,14};

	int min = arr[0];

	for (int i =0 ;i<arr.length; i++)
	{
		if (arr[i]  < min)
		{
			min = arr[i];
		}
	}
System.out.println(min);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaaa .pp();
	}

}
