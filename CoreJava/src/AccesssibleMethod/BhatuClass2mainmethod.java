package AccesssibleMethod;

public class BhatuClass2mainmethod {
	public static void main(String[] args) {
		
		 BhatuClass1 obj = new  BhatuClass1 ();
		 obj.addition();
		obj.multi();
		obj.floatnumbers();
		//  BhatuClass1 obj = new BhatuClass1 ();  // calling private method change visibility error
		//  obj.subtraction();   
		
		ParameterFizzBuzzQ3 obj1 = new ParameterFizzBuzzQ3();
		obj1.fizzbuzz(1);
	}

}
