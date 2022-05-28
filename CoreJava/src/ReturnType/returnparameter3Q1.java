package ReturnType;

public class returnparameter3Q1 {
	
void parameter (int a , int b)
{System.out.println(a);
System.out.println(b);
	if (a>=b)
	{
		System.out.println("gretest number a" );
	}
	else {
		System.out.println("gretest number b" );
	}
	}
	int pawar (int b)
	{
		System.out.println(b);
		return b;
	}
	int m2(int x , int y)
	{
		if(x>y)
		{
			System.out.println("x is greater than y");
		}
		else
		{
			System.out.println("y is greater than x");
		}
		return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		returnparameter3Q1 obj = new  returnparameter3Q1();
		//obj.parameter(45,54 );
		//obj.pawar(54);
		obj.m2(50, 40);
	}

}
