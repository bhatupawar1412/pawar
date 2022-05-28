package HelloJava;

public class dowhileloop1 {

void bhatu () {              // 1 to 10 number print
	int b = 1;                 // addition all number
int addition = 0;
	
	do
	{
	System.out.println(b);
		
	b=b+1;
		addition = addition+b-1;
		
	}
	while(b<=10);
	

	System.out.println("addition number" + addition);
}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 dowhileloop1 obj = new  dowhileloop1();
		 obj.bhatu();
	}

}
