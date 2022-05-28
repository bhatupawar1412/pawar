package TestPracticefistdayTo25jan;

public class AssWk1Q6 {
	
	void method ()
	{
		// 10 to 100 print for loop
		 int sum=0;
		 
		for (int i=10; i<=100; i++)
		{
			System.out.println(i);
	           
			sum=sum+i;
		}
		System.out.println("addition "+sum);
		System.out.println("-----------------------");
	}
	void m1 ()
	{
		// 6 to 10 
		int sum=0; 
		
		for (int i=6; i<=10; i ++)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("addi "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssWk1Q6 obj =new AssWk1Q6 ();
		// obj.method ();
		obj.m1();
	}

}
