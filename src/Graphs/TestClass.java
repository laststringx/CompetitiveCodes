package Graphs;

import java.io.*;
import java.util.*;

public class TestClass {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int T = Integer.parseInt(br.readLine().trim());
		for (int t_i = 0; t_i < T; t_i++) {
			String S = br.readLine();
			int Q = Integer.parseInt(br.readLine().trim());
			String[] arr_x = br.readLine().split(" ");
			int[] x = new int[Q];
			for (int i_x = 0; i_x < arr_x.length; i_x++) {
				x[i_x] = Integer.parseInt(arr_x[i_x]);
			}
			String[] arr_y = br.readLine().split(" ");
			int[] y = new int[Q];
			for (int i_y = 0; i_y < arr_y.length; i_y++) {
				y[i_y] = Integer.parseInt(arr_y[i_y]);
			}

			int out_ = solve(y, x, Q, S);
			System.out.println(out_);
			System.out.println("");
		}

		wr.close();
		br.close();
	}

	static int solve(int[] y, int[] x, int Q, String S) {
		// Write your code here
		int arr[] = new int[4];
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'L')
				arr[0]++;
			else if (S.charAt(i) == 'R')
				arr[1]++;
			else if (S.charAt(i) == 'D')
				arr[2]++;
			else if (S.charAt(i) == 'U')
				arr[3]++;
		}
		int count = 0;
		int ind = 0;
		int pointx=0;
		int pointy = 0;
		for (int i = 0; i < x.length; i++) {
			if (Math.abs(x[i]) <= arr[0]) {
				
				while(ind<S.length()) {
					for (int j = ind; j < S.length(); j++) {
						if(S.charAt(j)=='L') pointx--;
					}
					ind++;
				}
			}
		}
		return 0;

	}
}