package TestPracticefistdayTo25jan;

public class Asswk3Q4 {

	int mo (int a, int b)
	{   // int a= 1234;
		// int b=6789;
		
		 int i=a+b;
		System.out.println("addition " +i);
		
		int rev =0;
		int last=i%10;
		 while (i>0)
		 {
			 last=i%10;
			 
			 rev=rev*10+last;
			 
			 i/=10;
		 }
		 System.out.println("reverse ="+rev);
		return rev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Asswk3Q4 obj = new  Asswk3Q4 ();
		 obj.mo(1234, 6789);
	}

}
