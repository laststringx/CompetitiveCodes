package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestCommonSubSequence {

	static Set<String> set;

	public static void main(String[] args) throws Exception {
// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		set = new HashSet<String>();
		int t = Integer.parseInt(br.readLine());
		String a = br.readLine();
		String b = br.readLine();

		int[][] table = LCS(a, b);
		int length = table[a.length()][b.length()];
		char[] chars = new char[length];
		Arrays.fill(chars, '\0');
		fillSet(a, b, table, length, chars, a.length(), b.length());
		System.out.println(set);
	}

	private static void fillSet(String a, String b, int[][] table, int length, char[] chars, int k, int l) {
// TODO Auto-generated method stub

		int j;
		for (j = 0; j < length; j++) {
			chars[j] = '\0';
		}
		j--;

		while (k > 0 && l > 0) {
			if (a.charAt(k - 1) == b.charAt(l - 1)) {
				length--;
				chars[j] = a.charAt(k - 1);
				k--;
				l--;
				j--;
			} else if (a.charAt(k - 1) != b.charAt(l - 1)) {
				if (table[k][l - 1] > table[k - 1][l]) {
					l--;
				} else if (table[k][l - 1] < table[k - 1][l]) {
					k--;
				} else {
					fillSet(a, b, table, length, chars, k - 1, l);
					fillSet(a, b, table, length, chars, k, l - 1);
				}

			}
			if (chars[0] != '\0') {
				StringBuilder sbr = new StringBuilder();
				for (int m = 0; m < chars.length; m++) {
					sbr.append(chars[m]);
				}
				
				set.add(sbr.toString());
			}
		}

	}

	static int[][] LCS(String a, String b) {
		int m = a.length();
		int n = b.length();
		int[][] table = new int[m + 1][n + 1];

		for (int i = 0; i < m + 1; i++) {
			for (int j = 0; j < n + 1; j++) {
				if (i == 0 || j == 0) {
					table[i][j] = 0;
				} else if (a.charAt(i - 1) == b.charAt(j - 1))
					table[i][j] = table[i - 1][j - 1] + 1;
				else
					table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);

			}
		}
		for (int i = 0; i < m+1; i++) {
			for (int j = 0; j < n+1; j++) {
				System.out.print(table[i][j]+" ");
			}
			System.out.println();
		}
		return table;
	}
}
