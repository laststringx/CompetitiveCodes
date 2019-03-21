package Graphs;

import java.util.Scanner;

public class XORExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();

			int x1 = 0, x2 = 0;
			for (int i = 0; i < n; i++) {
				x1 = x1 ^ (i + 1);
			}
			for (int i = 0; i < n - 1; i++) {
				x2 = x2 ^ sc.nextInt();
			}
			System.out.println(x1 ^ x2);
		}

	}

}
