package PracticeProblem;

public class SameValueOrNotWx1 {

	static String a="bhatu";
	static void m()
	{
//2. Take input of age of 3 people (all values should be local) and determine oldest and youngest among them.
		
		int x=25;
		int y=35;
		int z=50;
		
		if(z>x && z>y)
		{
			System.out.println("z is oldest");
		}
		else
		{
			System.out.println("z is not oldest");
		}
		if(x<y || x>z)
		{
			System.out.println("x is youngest");
		}
		else
		{
			System.out.println("x not is youngest");
		}
	}
	
		
	public static void main(String[] args) {
		
		String b="pawar";
		
		if(a==b)
		{
			System.out.println("same value");
		}
		else
		{
			System.out.println("not same value");
		}
				
m();
	}

}
