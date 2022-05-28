package interviewPracticeProgram;

public class Reverse_Num {
public static void main(String[] args) {
	int num=1234;
	int rev=0;
	int last=num%10;
	
	while(num>0)
	{
		last=num%10;
		rev=rev*10+last;
		num/=10;
	}
	System.out.println("reverse num :" +rev);
	
	//-------------------------------------------
	Reverse_Num obj =new Reverse_Num();
	obj.m();
	
}
void m() {
	
	int num=12345;
	int rev=0;
	int last=num%10;
	for(int i=1; i<=5; i++)
	{
		if(num>0)
		{
			last=num%10;
			rev=rev*10+last;
			num/=10;
		}
		
	}
	System.out.println("reverse num :" +rev);
}
}
