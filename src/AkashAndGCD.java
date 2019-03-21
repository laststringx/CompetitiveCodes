import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AkashAndGCD {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	private static long func(int x) {
		// TODO Auto-generated method stub
		long answer = 0;
		for (int i = 1; i <= x; i++) {
			answer = (answer % 1000000007 + gcd(i, x) % 1000000007) % 1000000007;
		//	 answer += gcd(i, x);
		}
		return answer;
	}

	 private  static int gcd(int p, int q) {
	        while (q != 0) {
	            int temp = q;
	            q = p % q;
	            p = temp;
	        }
	        return p;
	    }

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		int q = Integer.parseInt(br.readLine());
		while (q-- > 0) {
			String s[] = br.readLine().split(" ");
			int a = Integer.parseInt(s[1]);
			int b = Integer.parseInt(s[2]);
			long answer = 0;
			if (s[0].equals("C")) {
				for (int i = a; i <= b; i++) {
					answer = (answer % 1000000007 + func(arr[i-1]) % 1000000007) % 1000000007;
					// answer += func(arr[i-1]);
				}
				System.out.println(answer);

			} else {
				arr[a - 1] = b;
			}

		}

	}

}
