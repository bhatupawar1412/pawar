
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r,sum=0, temp; //just amazing name
		
		int n=454;
		System.out.println(n);
		temp=n;
		while(n>2)
		{
		r=n%10;
		n=n/10;
		sum=(sum*10)+r;
			
		}
		if (temp==sum)
		{
			System.out.println("palindrome number");
		}	
		else {
			System.out.println("not palindrom number");
		}
		
		
			
			
			
	}

}
