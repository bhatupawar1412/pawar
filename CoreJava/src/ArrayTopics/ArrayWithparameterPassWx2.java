package ArrayTopics;

public class ArrayWithparameterPassWx2 {
	// for each loop 
	void A3d(int [][][] a)
	{
		// int [][][] a =new int [3][2][3];
		
		a [0][0][0] = 1 ;
		a [0][0][1] = 2 ;
		a [0][0][2] = 3 ;
		a [0][1][0] = 4 ;
		a [0][1][1] = 5 ;
		a [0][1][2] = 6 ;
		a [1][0][0] = 7 ;
		a [1][0][1] = 8 ;
		a [1][0][2] = 9 ;
		a [1][1][0] = 10 ;
		a [1][1][1] = 20 ;
		a [1][1][2] = 30;
		a [2][0][0] = 40;
		a [2][0][1] = 500;
		a [2][0][2] = 600 ;
		a [2][1][0] = 700;
		a [2][1][1] = 90 ;
		a [2][1][2] = 100 ;
		
		int add =0;
		
		for (int[][] i :a)
		{
			for(int[] j :i)
			{
				for (int k:j)
				{
					System.out.print(k + " ");
					add=add+k;
				}
				System.out.println(" ");
				
			}
			
		}
		System.out.println("additon " + add);
		System.out.println("----------------------------");
	}
	
	// for loop used
	void m1(int [][][] a)
	{

		// int [][][] a =new int [3][2][3];
		
		a [0][0][0] = 1 ;
		a [0][0][1] = 2 ;
		a [0][0][2] = 3 ;
		a [0][1][0] = 4 ;
		a [0][1][1] = 5 ;
		a [0][1][2] = 6 ;
		a [1][0][0] = 7 ;
		a [1][0][1] = 8 ;
		a [1][0][2] = 9 ;
		a [1][1][0] = 10 ;
		a [1][1][1] = 20 ;
		a [1][1][2] = 30;
		a [2][0][0] = 40;
		a [2][0][1] = 500;
		a [2][0][2] = 600 ;
		a [2][1][0] = 700;
		a [2][1][1] = 90 ;
		a [2][1][2] = 100 ;
		
	
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				for(int k=0; k<a[i][j].length; k++)
				{
					System.out.print(a[i][j][k] + " ");
					
				}
				System.out.println(" ");
			}
		}
		
		
	}
	public static void main(String[] args) {
		ArrayWithparameterPassWx2 obj = new ArrayWithparameterPassWx2();
		obj.A3d(new int [3][2][3]);
		obj.m1(new int [3][2][3]);
	}

}
