package interviewPracticeProgram;

import java.util.Scanner;

public class primeEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num..");
		int n = sc.nextInt();

		

		int c = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			System.out.println("prime number..");
		} else {
			System.out.println("no prime");
		}
	}
}