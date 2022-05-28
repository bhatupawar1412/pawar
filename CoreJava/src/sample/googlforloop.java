package sample;

public class googlforloop {

	void bhatu()
	{	
		int y=0; 
	
	int z=0;
	
	for (int x=1; x<=10; x++ )
	
	{
		if(x%2==0)
		
		{
			System.out.println(" even" + x);
			
			y=y+x;
		}
		else
		{
			System.out.println("odd" + x);
			z=z+x;
		}
	}
	System.out.println("addition sum even"+y);
	System.out.println("addition sum odd"+z);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		googlforloop obj =new googlforloop();
			obj.bhatu();
			
	}

}
