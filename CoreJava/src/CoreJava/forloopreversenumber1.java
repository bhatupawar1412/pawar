package CoreJava;

public class forloopreversenumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=123456789;
		int reverse=0;
		int lastdigit = num%10;
		
		
		for (int x=1;x<=9; x++)
		
		{
			if (x<=9)
			{
				lastdigit =num%10;
				
				reverse =reverse*10+lastdigit;
				
				num/=10;
			}
			
			
		}
		System.out.println(reverse);
		
	}

}
