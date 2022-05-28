package Parameterpassing;

public class parameterpassQ1 {
	void bhatu (int i)
	{
		for(i=1; i<=10; i++)
		{
			System.out.println(i);
			if(i%2==0)
			{
				System.out.println("even number"+i);
			}
			else {
				System.out.println("odd number"+i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameterpassQ1 obj = new parameterpassQ1();
		obj.bhatu(1);
	}

}
