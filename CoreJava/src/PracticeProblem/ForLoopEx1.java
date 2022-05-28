package PracticeProblem;

public class ForLoopEx1 {

	void m1()

	{
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("sum :" + sum);
	}

	void m2() {
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}

	void methodEO() {
		int sum = 0;
		int sum1 = 0;
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				System.out.println("even :" + i);
				sum = sum + i;

			} else {
				System.out.println("odd :" + i);
				sum1 = sum1 + i;
			}

		}
		System.out.println("sum even" + sum);
		System.out.println("sum odd" + sum1);
	}

	void rev() {
		int num = 1234;
		int rev = 0;
		int last = num % 10;
		for (int i = 1; i <= 4; i++) {
			if (num > 0) {

				last = num % 10;
				rev = rev * 10 + last;
				num /= 10;

			}

		}
		System.out.println("rev :" + rev);
	}

	void pali() {
		int num = 12321;
		int rev = 0;
		int last = num % 10;

		for (int i = 1; i <= 5; i++) {
			if (num > 0) {
				last = num % 10;
				rev = rev * 10 + last;
				num /= 10;
			}
		}
		System.out.println("palindro :" + rev);
	}

	void AtoZ() {

	for(char i='A'; i<='Z'; i++)
	{
		System.out.print(i +" ");
	}
	}
	
	

	public static void main(String[] args) {
		ForLoopEx1 obj = new ForLoopEx1();
		// obj.m1();
		// obj.m2();
		// obj.methodEO();
		// obj.rev();
		//obj.pali();
		obj.AtoZ();
		
	}

}
