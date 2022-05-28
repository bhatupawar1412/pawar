package ArrayTopics;

public class Array3DIMENSION {

	void A3D ()
	{
		int [][][] a=new int [2][3][2];
		
		a[0][0][0]  =10;
		a[0][0][1]  =20;
		a[0][1][0]  =30;
		a[0][1][1]  =40;
		a[0][2][0]  =50;
		a[0][2][1]  =60;
		a[1][0][0]  =70;
		a[1][0][1]  =80;
		a[1][1][0]  =90;
		a[1][1][1]  =100;
		a[1][2][0]  =110;
		a[1][2][1]  =120;
		
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
	
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array3DIMENSION obj = new Array3DIMENSION ();
		obj.A3D();
	}

}
