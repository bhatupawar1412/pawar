package ArrayTopics;

public class foreachLoopD2 {
static void pp ()
{ 
	// 4 row and 2 column
	
	int a[][] = new int [4][2];
	
a[0][0]  = 11;
a[0][1]  = 12;
a[1][0]  = 13;
a[1][1]  = 14;
a[2][0]  = 15;
a[2][1]  = 16;
a[3][0]  = 17;
a[3][1]  = 18;

for (int []i : a)

{
for (int j : i)	
{
System.out.print(j + " ");
	
}
System.out.println(" ");

}


}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foreachLoopD2 .pp();
	}

}
