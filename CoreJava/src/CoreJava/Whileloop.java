package CoreJava;

public class Whileloop {
	
	void bhatu()      // 1 to 10  print even odd  
	{
		int x=1;
		 while ( x<=10)
			 
			 if(x%2==0)
			 {
				 System.out.println("even num is " +x);
				 
				 x=x+1;
			 }
			 else
			 {
				 System.out.println("odd num is"+x);
				 
				 x=x+1;
			 }
	}
	
	public static void main(String[] args) {
		Whileloop obj = new Whileloop();
		obj.bhatu();
		
		
		
		
		
	}
	
	

}
