package NonAccesMethod;

public class WithfinalWithconstructor {

	
	final int i =10;
	final int x ;
	WithfinalWithconstructor ()
	{
		i=i+20;
		
		x=20;
		System.out.println(x);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithfinalWithconstructor obj = new WithfinalWithconstructor();
	}

}
