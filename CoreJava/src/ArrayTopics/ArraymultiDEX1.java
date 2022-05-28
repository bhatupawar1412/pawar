package ArrayTopics;

public class ArraymultiDEX1 {

	void multiD ()
	{
		int a [][] = new int [2][3];  // 2 Row and 3 Column
		
		a[0] [0] = 10;
		a[0] [1] = 20;
		a[0] [2] = 30;
		a[1] [0] = 1;
		a[1] [1] = 2;
		a[1] [2] = 3;
				
		System.out.println(a.length);  // i=0 || 0<2 
		
		
		for (int i = 0; i<a.length; i++) // j=0 || 0<3
		{
			for (int j= 0; j<a[i].length; j++)
			{
				
				System.out.print(a[i][j] +"\t");  // a[i][j]= [0][0]=
			}
			System.out.println(" ");
		}
	}
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	ArraymultiDEX1 obj =new ArraymultiDEX1 () ;
	 
	obj.multiD();
	
	
	
	
	
	
	
	}

}
