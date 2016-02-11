import java.util.Scanner;
import java.util.stream.Stream;

public class Q231A_Team {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		scanner.nextLine();
		String[] lines = new String[count];
		for (int i = 0; i < count; i++) {
			lines[i] = scanner.nextLine();
		}
		int[] scores = Stream.of(lines).mapToInt(str -> Stream.of(str.split(" ")).mapToInt(Integer::parseInt).sum()).toArray();
		int result = 0;
		for (int score : scores) {
			if (score >= 2) result++;
		}
		System.out.println(result);
	}

}
