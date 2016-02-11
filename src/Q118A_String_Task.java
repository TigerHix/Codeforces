import java.util.Scanner;

public class Q118A_String_Task {

	private static final String[] VOWELS = {"a", "o", "y", "e", "u", "i"};

	public static void main(String[] args) {
		String string = new Scanner(System.in).next();
		string = string.toLowerCase();
		for (String vowel : VOWELS) {
			string = string.replaceAll(vowel, "");
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			builder.append(".").append(string.charAt(i));
		}
		System.out.println(builder.toString());
	}

}
