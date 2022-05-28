package HelloJava;

public class dowhileloop2 {    // 1 to 10 print number
	
	void pawar()               // even odd
	{
	int p = 1;	
		
		do {
			if (p%2==0)
			{
				System.out.println("even num is" + p);
				
				p=p+1;
			}
			else {
				System.out.println("odd num is " +p);
				
				p=p+1;
			}
			
			
		}
		while(p<=10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dowhileloop2 obj = new dowhileloop2();
		obj.pawar();
	}

}
