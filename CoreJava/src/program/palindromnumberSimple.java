package program;

public class palindromnumberSimple {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12321;
		int reverse=0;
		int remainder =num %10;  //1
		reverse = reverse *10+ remainder; //1
		num/=10;
		remainder =num%10; //2
		reverse =reverse*10+remainder; //12
		num/=10;
		remainder =num%10;  //3
		reverse=reverse*10+remainder;  // 123
		num/=10; 
		remainder=num%10; //2
		reverse=reverse*10+remainder;  //1232
		num/=10;
		remainder=num%10; //1
		reverse=reverse*10+remainder;  //12321
		System.out.println(reverse);
	}

}
