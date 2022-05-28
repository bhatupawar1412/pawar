package HelloJava;

public class dowhileloop {

	void condition()
	{
		int i=1;
		do 
		{
			System.out.println(i);
			i=i+1;
		}
		while (i<=10);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dowhileloop obj = new dowhileloop();
		obj.condition ();
		
	}

}
