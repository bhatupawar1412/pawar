package ArrayTopics;

public class leftsidezeroEX1 {
void zeroset ()
{
int []a = {1,0,11,0,1,0,0}	;

for (int i=0 ; i<a.length; i++)
{

	for (int j=i+1; j<a.length; j++)
	{
		if(a[j]==0)
			
		{
			int zero = a[i];
			
			a[i]=a[j];
			
			a[j]=zero;
			
			}}
			
			System.out.print(a[i] + " ");
	}

}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	leftsidezeroEX1 oo = new leftsidezeroEX1 ();
	oo.zeroset();
	}

}
