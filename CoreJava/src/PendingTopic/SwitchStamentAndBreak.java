package PendingTopic;

public class SwitchStamentAndBreak {
	void sampleMethod()
	{
	//	int age=2; // 
	//	int age1=4;  //perticulas test case run karu shakto and case & break need why break nahi dila tar 
		// excution late hoil check pratekala 
		int age =20; // 20 test case no but default method used karto 
		switch(age)
		{
		case 1 :
			System.out.println("this is 1");
			break; //it will stop the execution
			
		case 2 :
			System.out.println("this is 2");
			break;
			
		case 3 :
			System.out.println("this is 3");
			break;
			
		case 4 :
			System.out.println("this is 4");
			
		case 5 :
			System.out.println("this is 5");
			break;
			
			default :
				System.out.println("No such case is present");
			
		}
	}

	public static void main(String[] args) {
		
		SwitchStamentAndBreak obj = new SwitchStamentAndBreak();
		obj.sampleMethod();

	}

}
