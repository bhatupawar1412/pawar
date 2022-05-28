package Assingnment;

public class Assingnment3 {

	 void reverseQ1 ()
	 {
		 int num = 12345;
		 int rev= 0;
		 int last = num%10; // 5
		  rev =rev *10+last ; // 5
		  num/=10;
		  last =num%10; // 4
		  rev=rev*10+last; //54
		  num/=10;
		  last =num%10 ; //3 
		  rev=rev *10+last ; //543
		  num/=10;
		  last =num %10 ; // 2
		  rev =rev *10+last;
		  num/=10;
		  last =num%10;
		  rev=rev*10+last;
		  num  /=10;
		 System.out.println(rev); 
		 
	 }
	 void palindrom ()
	 {
		 int num = 12321;
		 int rev= 0;
		 int last = num%10; // 5
		  rev =rev *10+last ; // 5
		  num/=10;
		  last =num%10; // 4
		  rev=rev*10+last; //54
		  num/=10;
		  last =num%10 ; //3 
		  rev=rev *10+last ; //543
		  num/=10;
		  last =num %10 ; // 2
		  rev =rev *10+last;
		  num/=10;
		  last =num%10; //1
		  rev=rev*10+last;
		  num  /=10;
		 System.out.println("palindrom number is "+rev); 
	 }
	  void incremetalOperator ()
	  {
		  int a=10;
		  a++;
		  System.out.println(a);
		  
		  int b=20;
		  b--;
		  System.out.println(b);
		  
		  float c= 4.4f;
		  double d = 5.4;
		  
		  System.out.println(c);
		  
		System.out.println(d);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assingnment3 obj = new Assingnment3  ();
		obj. reverseQ1();
		obj.palindrom();
		obj.incremetalOperator();
	}

}
