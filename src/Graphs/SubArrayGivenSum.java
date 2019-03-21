package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubArrayGivenSum {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String s1[] = br.readLine().split(" ");
			int n = Integer.parseInt(s1[0]);
			int k = Integer.parseInt(s1[1]);
			int arr[] = new int[n];
			String s2[] = br.readLine().split(" ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(s2[i]);
			}
			int i = 0, j = 0;
			int sum = 0;
			for (j = 0; j < s2.length; j++) {
				if (sum == k)
					break;
				sum += arr[j];
				while (sum > k && i < j) {
					sum -= arr[i];
					i++;

				}
			}
			System.out.println((i + 1) + " " + (j + 1));

		}
	}

}
