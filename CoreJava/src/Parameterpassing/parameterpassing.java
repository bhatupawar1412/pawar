package Parameterpassing;

public class parameterpassing {

	void bhatu (int b)
	{
		
	System.out.println(b);	
		}
	void bhatu1(String m)
	{
		System.out.println(m);
	}
	void bhatu2(int p, int q)
	{
		int z = p+q;
		System.out.println("addition is p and q" +  z);
	}
	void bhatu3 (int p , String n , char q)
	{
		System.out.println(p);
		System.out.println(n);
		System.out.println(q);
	}
	
	public static void main(String[] args) {
		
     parameterpassing obj= new parameterpassing();
		obj.bhatu(4004);
		obj.bhatu1("pawar");
		obj.bhatu2(404, 4004);
		obj.bhatu3(100, "kiran", 'k');
	}

}
