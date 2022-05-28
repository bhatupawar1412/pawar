package program;


public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =12345;
int b=a%10;
	
		System.out.println(b);
		
	int p=1234;
	int q=p%10;
	System.out.println(q);	
	
	int o = 123;
	int s =o%10;
	System.out.println(s);
	int x=12;
	int y=x%10;

			System.out.println(y);
	// reverse number
			int num=12345;
			int reverse=0;
			int remainder =num %10;  //5
			reverse = reverse *10+ remainder; //5
			num/=10;
			remainder =num%10; //4
			reverse =reverse*10+remainder; //54
			num/=10;
			remainder =num%10;  //3
			reverse=reverse*10+remainder;  // 543
			num/=10; 
			remainder=num%10; //2
			reverse=reverse*10+remainder;  //5432
			num/=10;
			remainder=num%10; //1
			reverse=reverse*10+remainder;  //54321
			System.out.println(reverse);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
}
