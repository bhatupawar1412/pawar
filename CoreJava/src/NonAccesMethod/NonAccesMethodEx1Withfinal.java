package NonAccesMethod;

public class NonAccesMethodEx1Withfinal {

	void finalEx1 ()
	{
		int i =10;
		
		i=i+20;
		
		System.out.println(i);
		
		// but with final
		final int x =10;
		
	//	x=x+20;
		System.out.println(x);
		final String name ="bhatu";
		// name=name,concat("bhatu")  // error show
		System.out.println(name);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonAccesMethodEx1Withfinal obj =new NonAccesMethodEx1Withfinal();
		obj.finalEx1();
	}

}
