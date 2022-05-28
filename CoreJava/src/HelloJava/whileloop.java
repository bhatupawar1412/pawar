package HelloJava;

public class whileloop {   // 1 to 5 while number print 
void numaddi ()	
{int sum=0;
	int b=1;
	while (b<=5)
	{
		System.out.println(b);
		
		b=b+1;
		sum=sum+b-1;
	}
System.out.println(sum);

}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		whileloop obj = new whileloop();
		obj.numaddi();
	}

}
