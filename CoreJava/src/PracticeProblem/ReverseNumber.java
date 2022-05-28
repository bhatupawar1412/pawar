package PracticeProblem;

public class ReverseNumber {
	
	public static void main(String [] args) {
		
		int a=12345;
		int b=a%10;
		System.out.println(b);
		int a1=1234;
		int b1=a1%10;
		System.out.println(b1);
	int a2=123;
	int b2=a2%10;
	System.out.println(b2);
	
	// all number reverse
	
	int num =12345;
	int rev =0;
	int last =num%10;//5
	rev=rev*10+last;//5
	num/=10;
	last=num%10; //4	
	rev=rev*10+last;//
	num/=10;
	last=num%10; //3	
	rev=rev*10+last;//
	num/=10;
	last=num%10; //2	
	rev=rev*10+last;//
	num/=10;
	last=num%10; //1	
	rev=rev*10+last;//
	num/=10;
	System.out.println("reverse ="+rev);
	
	//palindrom
	
	
	}

}
