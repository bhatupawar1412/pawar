package Parameterpassing;

public class parameterpassing2 {
void pawar1 (int i)
{
	
System.out.println("parameter passing");
int p = 100;
int q = p+i;
System.out.println(q);

}
void pawar1()
{
	System.out.println("without parameter passing");
	
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 parameterpassing2 obj = new  parameterpassing2 ();
		obj. pawar1 (10);
		obj.pawar1();
	}

}
