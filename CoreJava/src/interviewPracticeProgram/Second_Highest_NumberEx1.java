package interviewPracticeProgram;

import java.util.Arrays;

public class Second_Highest_NumberEx1 {

	void method() {
		// 1 20 5 6 16 10
		int array[] = { 1, 20, 5, 6, 16, 10 };
		Arrays.sort(array);
		System.out.println("third highest values " + array[array.length - 3]);
		System.out.println("Sec higth ele in the array " + array[array.length - 2]);
		System.out.println("firsh highest values " + array[array.length - 1]);

	}

	public static void main(String[] args) {
		Second_Highest_NumberEx1 obj = new Second_Highest_NumberEx1();
		obj.method();
	}
}
