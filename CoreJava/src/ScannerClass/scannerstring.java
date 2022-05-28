package ScannerClass;

import java.util.Scanner;

public class scannerstring {

	void printmethod()
	{
		Scanner obj =new Scanner (System.in);
		String name = obj.nextLine();
		System.out.println("my name is "+name);
		
		
	}
public static void main(String[] args) {
	scannerstring t = new scannerstring ();
	System.out.println("Enter your name :");
	t.printmethod();
}	
}
