package interviewPracticeProgram;

import java.util.Scanner;

public class nonRepeatativeCharEx2 {
	public static String nonRepeatativeChar(String str) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter char..");
		String chart = s.nextLine();
		for (int i = 0; i < str.length(); i++) {
			int c = 0;
			for (int j = 0; j < str.length(); j++) {
		
				if (str.charAt(i) == str.charAt(j) && i != j) {
					c = c + 1;
				}

			}
			if(c==0) {
				System.out.println(str.charAt(i));
				break ;
			}
		}
		return str;
	}

	public static void main(String[] args) {
		nonRepeatativeCharEx2 obj=new nonRepeatativeCharEx2 ();
		obj.nonRepeatativeChar("aabcde");
	}

}
