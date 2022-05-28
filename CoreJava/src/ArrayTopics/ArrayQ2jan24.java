package ArrayTopics;

public class ArrayQ2jan24 {
	
static void method ()
{  
	 // q2.add number from 1 TO 10 inside the array using for loop
	
	int [] a= {1,2,3,4,5,6,7,8,9,10};
	int addi=0;
	
  for (int i=0; i<a.length; i++)
  {
	  System.out.println(a[i]);
	  addi=addi+a[i];
  }
System.out.println("addition :" + addi);
System.out.println("-----------");
}

// for each loop

void m1 ()
{
	
	int [] a= {1,2,3,4,5,6,7,8,9,10};
	int addi=0;
	
	for (int i:a)
	{
		System.out.println(i);
		addi=addi+i;
	}
	System.out.println("addition "+ addi);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQ2jan24 obj = new ArrayQ2jan24();
		obj.method();
		obj.m1();
	}

}
