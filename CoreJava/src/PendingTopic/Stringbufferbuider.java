package PendingTopic;

public class Stringbufferbuider {

	// String Buffer

	// Synchronised
	// two or more thread can not call the methods at same time
	// less efficient
	// thread safe

	// String Bulder

	// Not synchronised
	// two or more thread can call the same time
	// more efficcient
	// not thread safe

	void stringmethod() {
		String s1 = "Bhatu";
		String s2 = "Pawar";
		String s3 = s1.concat(s2);
		System.out.println(s3);
	}

	void StringBuffer() {
//		StringBuffer bfr = new StringBuffer("Bhatu Pawar");
//		bfr.reverse();
//		System.out.println(bfr);
//
//		bfr.append(" Hello World");
//		System.out.println(bfr);

		StringBuffer br = new StringBuffer("Bhatu pawar");
		br.reverse();
		System.out.println(br);

		br.append("Radhekrishana");
		System.out.println(br);
	}

	void StringBuilder() {
		StringBuilder bld = new StringBuilder("Kiran Pawar");
		bld.reverse();
		bld.append(" Hello World1");
		System.out.println(bld);

	}

	public static void main(String[] args) {

		Stringbufferbuider obj = new Stringbufferbuider();
		// obj.stringmethod();
		obj.StringBuffer();
		// obj.StringBuilder();
	}

}
