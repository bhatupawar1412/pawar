package ReturnType;

public class returnprogram1 {

	int method(int n) {

		return n;
	}

	String methodstring(String s) {
		return s;
	}

	int method1(int g, int h) {
		int k = g + h;
		return k;
	}

	public static void main(String[] args) {
		returnprogram1 obj = new returnprogram1();
		System.out.println(obj.method(40));
		System.out.println(obj.methodstring("love u mom"));
		System.out.println(obj.method1(400, 50));

	}

}
