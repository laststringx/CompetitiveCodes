package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Leaders {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());

			int arr[] = new int[n];
			String str[] = br.readLine().split(" ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(str[i]);
			}
			boolean b[] = new boolean[n];
			Arrays.fill(b, false);
			int max = 0;
			for (int i = n - 1; i >= 0; i--) {
				if (arr[i] >= max) {
					max = arr[i];
					b[i] = true;
				}
			}
			for (int i = 0; i < b.length; i++) {
				if (b[i])
					System.out.print(arr[i] + " ");
			}
			System.out.println();

		}
	}

}
