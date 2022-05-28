package ArrayTopics;

public class ArrayMultiDEX2 {
void m1 ()
{
	int a[][] = new int [2][3];
	
	a[0][0] = 1;
    a[0][1] = 2;
    a[0][2] = 3;
    a[1][0] = 5; 
    a[1][1] = 6;
    a[1][2] = 7;
    
    for (int i=0; i<a.length; i++)
    {
    	for (int j=0; j<a[i].length; j++)
   
    	{
    		System.out.print(a[i][j] + "\t");
    	}
            System.out.println(" ");
    }
    
    
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayMultiDEX2 obj =new ArrayMultiDEX2 ();
		
		obj.m1();
		
	}

}
