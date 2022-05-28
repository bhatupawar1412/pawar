package ReturnType;

public class parametercomparestringQ2 {
static String B="Bhatu Pawar Dhule" ;
void method (String P)
{
	System.out.println(P);
	if (B == P)
	{
		System.out.println("string word same");
	}
	else
	{
		System.out.println("not string word same");
	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(B);
		parametercomparestringQ2 obj = new parametercomparestringQ2 ();
		obj.method("Bhatu Pawar Dhule");
	}

}
