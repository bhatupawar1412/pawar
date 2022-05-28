package TestPracticefistdayTo25jan;

public class Ass7Q2 {
	
	void age()
	{
		int a=50;
		int b=30;
		int c=15;
		System.out.println("age of a,b,c");
		
		if(a>b && a>c)
		{
			System.out.println("the oldest age a");
		}
		else
		{
			System.out.println("the youngest age a");
		}
		if (c>a && c>b)
		{
			System.out.println("the oldest age c");
		}
		else
		{
			System.out.println("the youngest age c");
		}
	}
public static void main(String[] args) {
	Ass7Q2 oo = new Ass7Q2();
	oo.age();
}
}
