import java.math.BigInteger;
import java.util.Scanner;

public class ColorFulBuildings {
	final static BigInteger MOD = BigInteger.valueOf(1000000007);

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			BigInteger bg, bg1;
			int n = sc.nextInt();
			int k = sc.nextInt();
			bg = BigInteger.valueOf(k);
			bg1 = BigInteger.valueOf(k - 1);
			for (int i = 1; i < n; i++) {

				bg = bg.multiply(bg1);
				bg = bg.mod(MOD);
			}

			System.out.println(bg.longValue());

		}
		sc.close();
	}
}
