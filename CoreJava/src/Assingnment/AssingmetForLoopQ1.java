package Assingnment;

public class AssingmetForLoopQ1 {

	// 10 to 1 number print decrement 
	// addition all number
	
	void decrement ()
	{
		
		int num = 10;
		int sum =0;
		for (int i=10; i>=1 ; i-- )
		{
			System.out.println(i);
			sum = sum+i;
		}
		System.out.println(sum);
		System.out.println("-----------------------------");
	}
	
	void increment ()
	{
		int sum=0;
		for (int x =1; x<=10; x++)
		{
			System.out.println(x);
			sum=sum+x;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssingmetForLoopQ1 obj =new AssingmetForLoopQ1 ();
		obj.decrement ();
		obj.increment();
	}

}
