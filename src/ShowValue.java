import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShowValue {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = br.readLine();
		}
		int m = Integer.parseInt(br.readLine());
		String[] b = new String[m];
		for (int i = 0; i < m; i++) {
			b[i] = br.readLine();
		}
		int[] aOdd = new int[26];
		int[] aEven = new int[26];
		int[] bOdd = new int[26];
		int[] bEven = new int[26];
		boolean[] result = new boolean[n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(aOdd, 0);
			Arrays.fill(aEven, 0);
			Arrays.fill(bOdd, 0);
			Arrays.fill(bEven, 0);

			for (int j = 0; j < a[i].length(); j++) {
				if (a[i].length() != b[i].length()) {
					result[i] = false;
					break;
				}
				if (j % 2 != 0) {
					aOdd[a[i].charAt(j) - 97]++;
					bOdd[b[i].charAt(j) - 97]++;
				} else {
					aEven[a[i].charAt(j) - 97]++;
					bEven[b[i].charAt(j) - 97]++;
				}
			}

			boolean flag = true;
			for (int j = 0; j < 26; j++) {
				if (aOdd[j] != bOdd[j]) {
					flag = false;
					break;
				}
				if (aEven[j] != bEven[j]) {
					flag = false;
					break;
				}
			}
			result[i] = flag;
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}