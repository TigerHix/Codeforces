import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q158B_Taxi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		scanner.nextLine();
		List<Integer> groups = Stream.of(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		groups.sort(Comparator.naturalOrder());
		int[] numberCounts = new int[5];
		for (int number : groups) {
			numberCounts[number]++;
		}
		int taxisNeeded = 0;
		int currentGroupSize;
		while (sum(numberCounts) > 0) {
			currentGroupSize = 0;
			for (int i = 1; i <= 4; i++) {
				if (numberCounts[i] > 0) {
					currentGroupSize = i;
					break;
				}
			}
			if (currentGroupSize == 0) break;
			numberCounts[currentGroupSize]--;
			switch (currentGroupSize) {
				case 4:
					break;
				case 2:
					if (numberCounts[2] > 0) {
						numberCounts[2]--;
					}
					break;
				case 1:
					if (numberCounts[3] > 0) {
						numberCounts[3]--;
					} else if (numberCounts[2] > 0) {
						numberCounts[2]--;
						if (numberCounts[1] > 0) {
							numberCounts[1]--;
						}
					} else if (numberCounts[1] > 0) {
						numberCounts[1]--;
						if (numberCounts[1] > 0) {
							numberCounts[1]--;
							if (numberCounts[1] > 0) {
								numberCounts[1]--;
							}
						}
					}
			}
			taxisNeeded++;
		}
		System.out.println(taxisNeeded);
	}

	private static int sum(int[] array) {
		return IntStream.of(array).sum();
	}

}
