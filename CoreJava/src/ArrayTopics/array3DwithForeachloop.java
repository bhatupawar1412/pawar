package ArrayTopics;

public class array3DwithForeachloop {

	void A3D ()
	{
		int a [][][] = new int [3][1][3];
		 a [0][0][0] = 1;     
		 a [0][0][1] = 2;
		 a [0][0][2] = 3;
		 a [1][0][0] = 4;
		 a [1][0][1] = 5;
		 a [1][0][2] = 6;
		 a [2][0][0] = 7;
		 a [2][0][1] = 8;
		 a [2][0][2] = 9;
		 
		 for (int[][] i :a)
		 {
			 for (int[] j : i)
			 {
				 for (int k : j)
				 {
					 System.out.print(k + " ");
					 
				 }
			 }
			 System.out.println(" ");
		 }
		 
		 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array3DwithForeachloop obj = new array3DwithForeachloop();
		obj.A3D();
	}

}
