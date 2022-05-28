package HelloJava;

public class forloop {
	void addition() {   // 10 to 100 print / addition
		
		for (int x=10; x<=100; x++)
			
		{
			System.out.println(x);
			
			x=x+1;
			
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		forloop obj = new forloop();
		obj.addition();
		
		
	}

}
