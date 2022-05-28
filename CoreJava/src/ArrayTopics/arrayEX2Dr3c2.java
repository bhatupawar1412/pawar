package ArrayTopics;

public class arrayEX2Dr3c2 {

	
	// 3 Row and 2 Column
	
	void R3C2 ()
	{
		int[][] a = new int[3][2];
		
		a[0] [0] = 10;
		a[0] [1] = 20;
		a[1] [0] = 30;
		a[1] [1] = 60;
		a[2] [0] = 70;
		a[2] [1] = 80;
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j] + "\t" );
			}
			System.out.println(" ");
		}
		System.out.println("--------------------------");
	}
	
	// 4 row and 2 column with foor loop
	
	void R4C2 ()
	{
		int a[][] = new int [4][2];
		
		a[0][0]  = 11;
		a[0][1]  = 12;
		a[1][0]  = 13;
		a[1][1]  = 14;
		a[2][0]  = 15;
		a[2][1]  = 16;
		a[3][0]  = 17;
		a[3][1]  = 18;
		
		
		for (int i=0; i<a.length ; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				
				System.out.print(a[i][j]+"\t");
				
				
			}
		System.out.println("");
		
		}
		System.out.println("--------------------------");
		}
	
	// 4 row and 2 column with for each loop 
	
	void eachloop ()
	{ 
		int a[][] = new int [4][2];
	
	a[0][0]  = 11;
	a[0][1]  = 12;
	a[1][0]  = 13;
	a[1][1]  = 14;
	a[2][0]  = 15;
	a[2][1]  = 16;
	a[3][0]  = 17;
	a[3][1]  = 18;
	
	for (int [] i: a)
	{
		for (int j: i)
		{
			System.out.print(j+ " ");
		}
		System.out.println(" ");
	}
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 arrayEX2Dr3c2 obj = new  arrayEX2Dr3c2 ();
		 obj.R3C2();
		 obj.R4C2();
		 obj.eachloop();
	}

}
