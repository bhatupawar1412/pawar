package Assingnment;

public class AssingmentWhileLoopaQ1Simple {

	// 1 to 10 print with addition 
	void whileaddi ()
	{int i=1;
	
	int sum = 0;
		while (i<=10)
		{
			System.out.println(i);
			
			i=i+1;
			sum=sum+i-1;
		}
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssingmentWhileLoopaQ1Simple  obj = new AssingmentWhileLoopaQ1Simple ();
		obj.whileaddi();

	}

}
