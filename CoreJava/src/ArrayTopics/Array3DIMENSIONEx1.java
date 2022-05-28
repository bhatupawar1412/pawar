package ArrayTopics;

public class Array3DIMENSIONEx1 {
 
	 // for each loop used
	
	void method ()
	{
		int [][][] a=new int [1][2][3];
		
		a[0][0][0]=10;
		a[0][0][1]=10;
		a[0][0][2]=10;
		a[0][1][0]=10;
		a[0][1][1]=10;
		a[0][1][2]=10;
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				for (int k=0; k<a[i][j].length; k++)
				{
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println(" ");
			}
		}
		System.out.println("-----------------");
	}
		
	void m2 ()
	{
		int [][][] a=new int [1][2][3];
	
	a[0][0][0]=60;
	a[0][0][1]=50;
	a[0][0][2]=40;
	a[0][1][0]=30;
	a[0][1][1]=20;
	a[0][1][2]=10;
	
	for (int [][] i :a)
	{
		for (int [] j :i)
		{
			for (int k : j)
			{
				System.out.print(k + "\t");
			}
			System.out.println(" ");
		}
	}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array3DIMENSIONEx1  obj = new Array3DIMENSIONEx1 ();
		obj.method();
		obj.m2();
	}

}
