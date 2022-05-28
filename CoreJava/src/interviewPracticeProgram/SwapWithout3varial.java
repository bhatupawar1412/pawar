package interviewPracticeProgram;

public class SwapWithout3varial {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		a = a + b;// 30
		b = a - b;// 30-20=10

		a = a - b;
		System.out.println("a :" + a);
		System.out.println("b " + b);

		// ----------------
		int x = 20;
		int y = 30;
		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("a "+a);
		System.out.println("b "+b);

	}

}
