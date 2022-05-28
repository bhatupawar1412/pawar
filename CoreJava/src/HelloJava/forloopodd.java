package HelloJava;

public class forloopodd {
void Dhule()                      // 10 to 5 odd number print

{
	for(int x=10; x>=5; x--)
	{
		if (x%2==1)
		
		{
				System.out.println("odd number" + x);
			
			}
		else {
			
			System.out.println("not odd number" + x);
		}
	}	
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forloopodd obj = new forloopodd();
		obj.Dhule();
	}

}
