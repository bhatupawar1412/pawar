package Parameterpassing;

public class parameterpassingQ3 {
void mymethod(int i)
{
	System.out.println(i);
	int addi=0;
	for (i=1; i<=10; i++)           // odd number  
	if (i%2==1)
	{
	System.out.println("odd number" +i);

		
			}
	else {
		 System.out.println("not odd number"+i);
		
		 
	}

}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameterpassingQ3 obj = new parameterpassingQ3();
		obj.mymethod(1);
	}

}
