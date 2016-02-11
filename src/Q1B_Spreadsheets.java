import java.util.Scanner;

public class Q1B_Spreadsheets {

	public static void main(String[] unusedArgs) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		String[] in = new String[length], out = new String[length];
		for (int i = 0; i < length; i++) {
			in[i] = scanner.next();
		}
		for (int i = 0; i < length; i++) {
			String coord = in[i];
			if (coord.startsWith("R") && Character.isDigit(coord.charAt(1)) && coord.contains("C")) {
				int x = Integer.valueOf(coord.substring(1, coord.indexOf("C")));
				int y = Integer.valueOf(coord.substring(coord.indexOf("C") + 1, coord.length()));
				out[i] = intToString(y) + String.valueOf(x);
			} else {
				int occurence = 0;
				while (!Character.isDigit(coord.charAt(occurence))) occurence++;
				int y = stringToInt(coord.substring(0, occurence));
				int x = Integer.valueOf(coord.substring(occurence, coord.length()));
				out[i] = "R" + x + "C" + y;
			}
		}
		for (String string : out) {
			System.out.println(string);
		}
	}

	private static String intToString(int a) {
		int decrease = (int) Math.pow(26, 4);
		int[] array = new int[5];
		for (int i = 4; i >= 0; i--) {
			while (a > decrease) {
				a -= decrease;
				array[i]++;
			}
			if (array[i] == 0) array[i] = -1;
			decrease /= 26;
		}
		array[0]++;
		for (int i = 3; i >= 0; i--) {
			int j = i;
			while (array[j] == 0) {
				array[j] = 26;
				array[j + 1]--;
				j++;
			}
		}
		String out = "";
		for (int i : array) {
			if (i > 0) {
				out = (char) (i + 64) + out;
			}
		}
		return out;
	}

	private static int stringToInt(String string) {
		int out = 0;
		for (int i = 0; i < string.length(); i++) {
			out += (string.charAt(i) - 64) * Math.pow(26, string.length() - i - 1);
		}
		return out;
	}

}
