package PracticeProblem;

import java.util.Scanner;

public class PrimeNumberScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		for(int a=1;a<=n;a++)
		{			
			int count=0;
			for(int b=1; b<=a; b++)
			{				
				if(a%b==0)
				{					
					count++;								
				}
			}
			if(count==2)
			{
				System.out.println(" prime num"+a);
			}

	}

}}
