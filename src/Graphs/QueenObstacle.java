package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QueenObstacle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String str[] = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			String s[] = str[1].substring(1, str[1].length() - 1).split(",");
			int a = Integer.parseInt(s[0]) - 1;
			int b = Integer.parseInt(s[1]) - 1;
			// left + right + diagonals 4 ways
			long count = 2 * (n - 1) + Math.min(a, b) + Math.min(n - a - 1, n - b - 1) + Math.min(n - a - 1, b)
					+ Math.min(a, n - b - 1);
			System.out.println(n * n - count);
		}

	}
}
