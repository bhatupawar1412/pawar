package ArrayTopics;

public class PassthearrayinmethodQ1jan24 {

	void parameterPass (int [] a)
	{
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
	
		int add = 0;
		for (int i:a)
		{
	
		System.out.println(i);
		add=add+i;
		}
		System.out.println("addition " +add);
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
	PassthearrayinmethodQ1jan24  obj = new PassthearrayinmethodQ1jan24 ();
		obj.parameterPass(new int  [5]);

	}

}
