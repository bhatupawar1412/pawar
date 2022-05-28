package TestPracticefistdayTo25jan;

public class Ass6Q1 {
	
	static int a=16;
	static int b=17;
	static int c=18;
	
	static String d ="November";
	static String e ="December";
	static String f ="January";
	
public static void main(String[] args) {
	
	if (d=="November")
	{
		if (a==16)
		{
			if(b==17)
			{
				if (c==16)
				{
					System.out.println("today date 18dec");
				}
				
			}
		}
		else
		{
			System.out.println("not today date 18dec");
		}
	}
	if (e=="December")
	{
		if (a==16)
		{
			if(b==17)
			{
				if(c==18)
				{
					System.out.println("today date 18dec");
				}
			}
		}
		else
		{
			System.out.println("not today date 18dec");
		}
	}
	if(f=="January")
	{
		if (a==16)
		{
			if (b==17)
			{
				if (c==19)
				{
					System.out.println("today date 18dec");
				}
			}
		}
		else
		{
			System.out.println("not today date 18dec");
		}
	}
}
}
