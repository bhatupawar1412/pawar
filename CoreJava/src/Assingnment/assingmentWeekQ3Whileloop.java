package Assingnment;

public class assingmentWeekQ3Whileloop {
	
	// 6 to 10 while 
	
	void method ()
	{int i =  6;
	int sum =0;
		while (i<=10)
		{
			System.out.println(i);
			i=i+1;
			sum=sum+i-1;
		}
		System.out.println(sum);
		System.out.println("-----------------");
	}
	//same for loop used
	void method1 ()
	{
		int addi=0 ;
		
		for (int x=6; x<=10; x++)
		{
			System.out.println(x);
			addi=addi+x;
		}
		System.out.println(addi);
	}

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			assingmentWeekQ3Whileloop obj = new assingmentWeekQ3Whileloop ();
		
		//obj.method();
		
		obj.method1();
	}

}
