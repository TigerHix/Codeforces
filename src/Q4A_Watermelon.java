import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q4A_Watermelon {

	private static final Map<Boolean, String> RESULT_MAP = new HashMap<>();

	static {
		RESULT_MAP.put(true, "YES");
		RESULT_MAP.put(false, "NO");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt();
		boolean result = true;
		if (w % 2 != 0) result = false;
		if (w == 2) result = false;
		System.out.println(RESULT_MAP.get(result));
	}

}
