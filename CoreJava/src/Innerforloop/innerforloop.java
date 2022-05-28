package Innerforloop;

public class innerforloop {
	
	void bhatu ()
	{
		for(int x=1;x<=3;x++)
		{
		System.out.println("----outer for loop----");	
			for(int z=1;z<=2;z++)
			{
				System.out.print("inner for loop--------");
			}
			System.out.println(" ");
		}
		
	}
	void pawar()
	{
		System.out.println("current year 2021");
		System.out.println("new year 2022");
		System.out.print("--bhatu 1---");
		System.out.println("---pawar 2-------");
	}
	
	public static void main(String[] args) {
		innerforloop obj =new innerforloop();
		obj.bhatu();
		obj.pawar();
	}
	
	
	
	
}
