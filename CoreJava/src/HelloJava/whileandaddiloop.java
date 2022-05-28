package HelloJava;

public class whileandaddiloop {

	public static void main(String[] args) {     // Print 6 to 10 number. 
		// TODO Auto-generated method stub
		int addition = 0;                     // then addition all number
		int x = 6;
		
		while (x<=10)
		{
			System.out.println(x);
			
		x=x+1;
		addition = addition+x-1;
		}
		
		
		System.out.println("addition o all number" + addition);
		
	}

}
