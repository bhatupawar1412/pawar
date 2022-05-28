package PendingTopic;

public class Split_String {

	public static void main(String[] args) {

		// The split() method divides the string at the specified regex and returns an
		// array of substrings.

		// String str="@There @is a garden And @it is very beautiful";

		String str = "bhatu@pawar";

		String[] a = str.split("@");

	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}

		
	}

}
