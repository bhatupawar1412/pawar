package PracticeProblem;

import java.util.Scanner;

public class ReadDataFromUser {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in); // obj will read the data from console
		
		System.out.println("Plaese enter month : ");
		
		String month = obj.nextLine(); //read the string data from user 
		
		int number = obj.nextInt(); // this will read the integer data from user
		System.out.println("You have entered month is : "+ month);
		System.out.println("You have entered data is : "+number);
		
	}
	
}
