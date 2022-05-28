package HelloJava;

public class whileloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub         // 1) 1 to 5 number print 
		
		int num = 5;
		int i =1;
	
		while ( i<=5)
		{
			
			System.out.println(i);
			
		i=i+1;   // or  i++;
	
		
		}
		
		
	//2)  do while  loop 
		int x=1 , num1=5;
		
		do 
		{
			System.out.println(x);
			x=x+1;
		
		}
		while(x <= 5);
	}

}
