package AccesssibleMethod;

public class ParameterReturnpassing {
	
	void parameterpassing (int x)
	{
		for (x=1;x<=20;x++)
		{
			if(x%3==0)
			{
				System.out.println("fizz "+x);
			}
			else
			{
				System.out.println(("no fizz  "+x));
			}
				if (x%5==0)
				{
					System.out.println("buzz "+x);
				}
				else
				{
					System.out.println("no buzz number "+x);
				}	}
		}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ParameterReturnpassing obj = new ParameterReturnpassing();
	obj.parameterpassing (1);

	}

}
