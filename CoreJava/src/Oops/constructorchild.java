package Oops;

public class constructorchild extends constructorparent {
	
	 constructorchild ()
	{
		
		 System.out.println("this is vaibhav");
	}	
		
		public static void main(String[] args) {
			
		//	constructorchild  obj1 = new constructorchild ();
			// both allow accesses child with parent
			
		//	constructorparent obj2 = new constructorparent ();
			// only parent allow
			
		//	constructorparent obj3 = new constructorchild ();
			// both allow accesses child with parent
			
			//constructorchild  obj1 = new  constructorparent ();
			//this combination not allow 
		}
	
}
