package sample;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year=2015; //356 day
		int year1=2020;	//366 day 
		
		if(year%4==0)
		{
			System.out.println("leap year 2015"); //
	
	}
		else
		{
			
			System.out.println("not leap year 2015");
		}
		if(year1%4==0)
		{
			System.out.println("leap year 2020");
		}
		else
		{
			System.out.println("not leap year 2020");
		}
		
	}
	
	

}
