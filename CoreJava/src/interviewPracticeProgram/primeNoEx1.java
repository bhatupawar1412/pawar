package interviewPracticeProgram;

public class primeNoEx1 {
public static void main(String[] args) {
//	int a=15;
//	int c=0;
//	for(int i=1;i<=a;i++)
//	{
//		if(a%i==0)
//		{
//			c++;
//		}
//	}
//	
//	if(c==2)
//	{
//		System.out.println("no is prime");
//	}
//	else
//	{
//		System.out.println("not");
//	}	
	primeNoEx1 obj=new primeNoEx1();
	obj.m();
}
void m() {
	
	int a=13;
	int c=0;
for(int i=1; i<=a; i++)
{
	if(a%i==0)
	{
		c++;
		
	}
	
	}
if(c==2)
{
	
System.out.println("prime number");
}
else
{
	
System.out.println("no prime");
	}
}
}