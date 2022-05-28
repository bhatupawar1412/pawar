package PendingTopic;

public class ContinuesAndbreak {

	void continues(){
		// continue statement is used to continues the next iterator in the loop
		// if used only loop
		//Keyword "continue" statement used
		
		int i;
		for(i=1; i<=10; i++)
		{
			if(i==5)
			continue;
				System.out.println(i);
			
		}
	}
	void m2() {
		// Brake Statement is used to terminates the loop
		// it is used in loop and switch case.
		int i;
		for(i=1; i<=10; i++)
		{
			if(i==5)
				break;
			System.out.println(i);
		}
		
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		ContinuesAndbreak obj = new ContinuesAndbreak();
		obj.continues();
		obj.m2();
	}
}
