import java.util.Scanner;

public class Q1A_TheatreSquare {

	public static void main(String[] unusedArgs) {
		String[] in = new Scanner(System.in).nextLine().split(" ");
		int n = Integer.valueOf(in[0]), m = Integer.valueOf(in[1]), a = Integer.valueOf(in[2]);
		long na = (long) Math.ceil((double) n / a);
		long ma = (long) Math.ceil((double) m / a);
		System.out.println(na * ma);
	}

}
