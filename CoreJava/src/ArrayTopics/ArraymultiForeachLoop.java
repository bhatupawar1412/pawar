package ArrayTopics;

public class ArraymultiForeachLoop {
void foreachloop ()
{
	// for each loop
	
	int a[][] = new int [2][3];
	
	a[0][0]  = 10;
	a[0][1]  = 20;
	a[0][2]  = 30;
	a[1][0]  = 1;
	a[1][1]  = 2;
	a[1][2]  = 3;
	
	for (int[] i : a)
	{
		for (int j : i)
		{
			System.out.print(j+" " );
		}
		System.out.println(" ");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraymultiForeachLoop obj = new ArraymultiForeachLoop ();
		obj.foreachloop ();
	}

}
