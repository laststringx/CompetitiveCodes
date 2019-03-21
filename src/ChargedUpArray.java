import java.util.Scanner;

public class ChargedUpArray {
	final static long MOD = 1000000007;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long sum = 0;
			long n = sc.nextLong();
			long check = (long) Math.pow(2, (n - 1));

			for (int i = 0; i < n; i++) {
				long a = sc.nextLong();
				if (a >= check) {
					sum = (sum + a) % MOD;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
