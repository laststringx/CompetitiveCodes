import java.util.Scanner;

public class PlotTheCurve {
	final static long MOD = 1000000007;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int count = 0;
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();
			long m = sc.nextLong();
			a = a % m;
			b = b % m;
			c = c % m;
			d = d % m;
			int n = sc.nextInt();
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
			}
			long first[] = new long[n];
			long second[] = new long[n];
			for (int i = 0; i < n; i++) {
				first[i] = power(arr[i], 2, m);
			}
			for (int i = 0; i < n; i++) {
				long x = arr[i] % m;
				long x2 = power(x, 2, m);
				long x3 = (x2 % m * x) % m;
				second[i] = (long) (multiplyMod(a, x3, m) + multiplyMod(b, x2, m) + multiplyMod(c, x, m) + d) % m;
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {

					/*
					 * long lhs = power(arr[i], 2, m); long x = arr[j] % m; long x2 = power(x, 2,
					 * m); long x3 = (x2 % m * x) % m; // long rhs = (long) ((a * x3) % m + (b * x2)
					 * % m + (c * x) % m + d) % m; long rhs = (long) (multiplyMod(a, x3, m) +
					 * multiplyMod(b, x2, m) + multiplyMod(c, x, m) + d) % m;
					 */ if (first[i] == second[j])
						count++;
				}
			}
			System.out.println(count);
		}
		sc.close();

	}

	static long power(long x, long y, long m) {

		long response = 1;
		x = x % m;

		while (y > 0) {
			if ((y & 1) == 1)
				response = (response * x) % m;
			y = y >> 1;
			x = (x * x) % m;
		}
		return response;
	}

	static long multiplyMod(long a, long b, long m) {
		long response = 0;
		while (b > 0) {
			if (b % 2 != 0) {
				response = (response + a) % m;
			}
			a = (a * 2) % m;
			b = b / 2;
		}
		return response;
	}

}
