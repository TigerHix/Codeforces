import java.util.Scanner;

public class Q71A_Way_Too_Long_Words {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		String[] words = new String[count];
		for (int i = 0; i < count; i++) {
			words[i] = scanner.next();
		}
		String[] results = new String[count];
		for (int i = 0; i < count; i++) {
			String word = words[i];
			if (word.length() <= 10) {
				results[i] = word;
			} else {
				results[i] = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
			}
		}
		for (String result : results) {
			System.out.println(result);
		}
	}

}
