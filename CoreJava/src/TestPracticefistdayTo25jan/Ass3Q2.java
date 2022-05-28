package TestPracticefistdayTo25jan;

public class Ass3Q2 {
	
	
	static String a ="this is bhatu";

	
	
	static void m1rev()
	{
		int n =12345;
		 
		int n1=n%10;
		System.out.println(n1);
		
		int n2=1234;
		int n3=n2%10;
		System.out.println(n3);
		
		int n4=123;
		int n5=n4%10;
		System.out.println(n5);
		
		int n6=12;
		int n7=n6%10;
		System.out.println(n7);
		
		int n8=1;
		int n9=n8%10;
		System.out.println(n9);
	}	
		
	static void m2REV ()	
	{
		int number=12345;
		int rev=0;
		int lastD =number%10; // 5
		rev=rev*10+lastD;
		number/=10;  //5
		lastD=number%10; //4
		rev=rev*10+lastD;
		number/=10; //54
		lastD=number%10; //3
		rev=rev*10+lastD;
		number/=10; //543
		lastD=number%10;//2
		rev=rev*10+lastD;
		number/=10; //5432
		lastD=number%10;//1
		rev=rev*10+lastD;
		number/=10;//54321
		
		
		System.out.println("reverse "+rev);
		
		}
		static void palindromnumber()
		{
			int num=12321;
			int rev=0;
			int last=num%10; // 5
			rev=rev*10+last; //5
			num/=10;
			last=num%10; //4 
			rev=rev*10+last; //54
			num/=10;
			last=num%10; //3
			rev=rev*10+last;//543
			num/=10;
			last=num%10;//2
			rev=rev*10+last;//5432
			num/=10;
			last=num%10;//1
			rev=rev*10+last;//54321
					num/=10;
			
					System.out.println("palindrom "+rev);
			
		}
		
		static void incremet ()
		{
			int a=10;
			a++;
			System.out.println(a);
			
		}
		static void charactor()
		{
			char x='a';
			char y= 'b';
			char z='c';
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
			
			
			
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 m1rev();
		 Ass3Q2. m2REV();
		 palindromnumber();
		 Ass3Q2. incremet ();
		 Ass3Q2. charactor ();
			System.out.println(a);
	}

}
