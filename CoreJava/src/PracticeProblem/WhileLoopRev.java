package PracticeProblem;

public class WhileLoopRev {

	// reverse
	void whileloop() {
		int a = 1234;
		int rev = 0;
		int last = a % 10;

		while (a > 0) {
			last = a % 10;
			rev = rev * 10 + last;
			a /= 10;
		}
		System.out.println("reverse " + rev);
	}

	void m2() {
		int a = 1234;
		int rev = 0;
		int last = a % 10;

		for (int i = 1; i <= 4; i++) {
			last = a % 10;
			rev = rev * 10 + last;
			a /= 10;
		}

		System.out.println("Reverse :" + rev);

	}

	public static void main(String[] args) {

		WhileLoopRev obj = new WhileLoopRev();
		obj.whileloop();
		obj.m2();
	}

}
