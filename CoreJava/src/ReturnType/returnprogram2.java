package ReturnType;

public class returnprogram2 {
int bhatu (int a)
{
	int x = a+5;
	return x;
}	
int multipleused (int rollnumber,String studentname)
{
	int n=0;
	
	System.out.println(rollnumber);
	System.out.println(studentname);
	return n;
}
void student(int rollnumber,String studentname)
{
	System.out.println(rollnumber);
System.out.println(studentname);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		returnprogram2 obj = new returnprogram2();
		System.out.println(obj.bhatu(10));
		obj. multipleused(1,"bhatu");
		obj. multipleused(2,"vaibhav");
		obj. multipleused(3,"vishal");
		obj. multipleused(4,"bala");
		// void use
		
		obj. student(10,"shital");
		obj. student(20,"tanu");
		obj. student(40,"manu");
	}

}
