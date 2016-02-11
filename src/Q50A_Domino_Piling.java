import java.util.Scanner;

public class Q50A_Domino_Piling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		if (m < n) {
			int tmp = n;
			n = m;
			m = tmp;
		}
		int mPlacement = m / 2;
		int nPlacement = 0;
		if (mPlacement * 2 != m) {
			nPlacement = n / 2;
		}
		System.out.println(mPlacement * n + nPlacement);
	}

}
