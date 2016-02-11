import java.util.Scanner;
import java.util.stream.Stream;

public class Q158A_Next_Round {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] a = scanner.nextLine().split(" ");
		String[] b = scanner.nextLine().split(" ");
		int k = Integer.valueOf(a[1]);
		int[] scores = Stream.of(b).mapToInt(Integer::parseInt).toArray();
		int advanceLine = 0;
		int validScores = 0;
		for (int score : scores) {
			validScores++;
			if (validScores == k) {
				advanceLine = score;
			}
		}
		int count = 0;
		for (int score : scores) {
			if (score >= advanceLine && score != 0) count++;
			else break;
		}
		System.out.println(count);
	}

}
