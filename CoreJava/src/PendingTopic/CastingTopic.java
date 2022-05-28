package PendingTopic;

public class CastingTopic {

	void windeningCasting()
	{
		int testInterger=10;
		double testDouble=testInterger;
		System.out.println(testInterger);
		System.out.println(testDouble);
	}
	void narrowCasting()
	{
		double testDouble=10.5d;
		int testInterger=(int) testDouble;
		System.out.println(testDouble);
		System.out.println(testInterger);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CastingTopic obj =new CastingTopic();
	//	obj.windeningCasting();
		obj.narrowCasting();

	}

}
