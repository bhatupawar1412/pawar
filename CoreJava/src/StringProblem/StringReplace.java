package StringProblem;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// replace problem 
		
		String a="bhatupawar";
		String b = "focuson";
		String c="i am the king the it";
		System.out.println(c.replace("the", "and"));
		System.out.println(a.replace('a', 'd'));
		System.out.println(b.replace('o','p'));
		
		// split Spring
		System.out.println(a.split(c, 0));
	}

}
