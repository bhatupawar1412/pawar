package ArrayTopics;

public class array3D {
void pp ()
{
int a [][][] = new int [3][1][3];

     a[0][0][0] = 1;
     a[0][0][1] = 2;
     a[0][0][2] = 3;
     a[1][0][0] = 4;
     a[1][0][1] = 5;
     a[1][0][2] = 6;
     a[2][0][0] = 7;
     a[2][0][1] = 8;
     a[2][0][2] = 9;
     
     System.out.println(a.length);// length 3     
     
     for (int i =0; i<a.length; i++)
     {
    	 for (int j=0; j<a[i].length; j++)
    	 {
    		 for (int k=0; k<a[i][j].length; k++)
    		 {
    			 System.out.print(a[i][j][k] + "\t");
    		 }
    		
    	 }
    	 System.out.println(" ");
     } 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		array3D obj = new array3D  ();
		obj.pp ();
		
		
		
		
	}

}
