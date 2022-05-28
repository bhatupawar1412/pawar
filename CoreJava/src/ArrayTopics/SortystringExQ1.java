package ArrayTopics;

import java.util.Arrays;

public class SortystringExQ1 {
	
	//Q1. string 5 names into array & sort them 
	void method ()
	{
		String[] mysister= {"rupali","vidya","tanaya","khushi","purva","sakshi","sayali"};
		
		
		Arrays.sort(mysister);
		System.out.println(Arrays.toString(mysister));
		
	}
	void method1 ()
	{
		String[] brother = {"bhatu" ,"daksha","vaibhav","kuldeep","harshal","laxmikant"};
	
		Arrays.sort(brother);
		System.out.println(Arrays.toString(brother));
		
	
	}
void m1 ()
{
    String[] name = {"pawar","gujar","keskar","vaidya"};

Arrays.sort(name);

System.out.println(Arrays.toString(name));

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortystringExQ1 obj = new SortystringExQ1 ();
		obj.method();
		obj.method1();
		obj.m1();
	}

}
