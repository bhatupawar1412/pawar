package ReturnType;

public class parameterreverseaddiQ4 {
	
	int method (int p, int q)
	{
		int z = p+q;
	
	System.out.println("addition =" + z);
	int rev=0;
	int last =z%10;
	while (z>0)
	{
		last=z%10;
		rev=rev*10+last;
		z/=10;
		}
	System.out.println("reverse value="+ rev);
	return rev;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameterreverseaddiQ4 obj = new parameterreverseaddiQ4();
		obj.method(1234,6789);

		
	}

}
