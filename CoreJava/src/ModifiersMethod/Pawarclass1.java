package ModifiersMethod;

import AccesssibleMethod.BhatuClass1;
import ConstructorTopics.ConstructorPrivateMM;

class Pawarclass1{     
	
	
	 public static void main(String[] args) {
		// METHOD WORK 
		BhatuClass1 obj = new BhatuClass1 ();
		obj.addition();
	// obj.multi();  default method ERROR  change visibility to public
		
		// obj.subtraction (); Protected method ERROR change visibility to public
		
		ConstructorPrivateMM obj1 = new ConstructorPrivateMM ();
		
		
		
		
		
	}

}
