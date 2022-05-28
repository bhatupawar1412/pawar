package Assingnment;

public class Assingment6Q1palindrom {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assingment6Q1palindrom obj = new Assingment6Q1palindrom ();
		obj.palindrom();
	}

}
