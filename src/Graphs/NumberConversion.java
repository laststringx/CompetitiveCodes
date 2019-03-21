package Graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumberConversion {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int T = Integer.parseInt(br.readLine().trim());
		for (int t_i = 0; t_i < T; t_i++) {
			int n = Integer.parseInt(br.readLine().trim());
			String[] arr_A = br.readLine().split(" ");
			int[] A = new int[n];
			for (int i_A = 0; i_A < arr_A.length; i_A++) {
				A[i_A] = Integer.parseInt(arr_A[i_A]);
			}
			String[] arr_P = br.readLine().split(" ");
			int[] P = new int[n];
			for (int i_P = 0; i_P < arr_P.length; i_P++) {
				P[i_P] = Integer.parseInt(arr_P[i_P]);
			}
			String[] arr_Q = br.readLine().split(" ");
			int[] Q = new int[n];
			for (int i_Q = 0; i_Q < arr_Q.length; i_Q++) {
				Q[i_Q] = Integer.parseInt(arr_Q[i_Q]);
			}

			long out_ = solve(A, P, Q);
			System.out.println(out_);
		}

		wr.close();
		br.close();
	}

	static long k = 0;

	static long solve(int[] A, int[] P, int[] Q) {

		// Your Code Here
		int n = A.length;
		int[] diff = new int[n];
		for (int i = 0; i < n; i++) {
			diff[i] = P[i] + Q[i];
		}
		// find minimum

		int[] minRange = new int[n];
		int[] maxRange = new int[n];
		for (int i = 0; i < n; i++) {
			minRange[i] = A[i] - Q[i];
			maxRange[i] = A[i] + P[i];
		}
		Set<Integer> first = new HashSet<Integer>();
		for (int i = minRange[0]; i <= maxRange[0]; i++) {
			first.add(i);
		}
		
		for (int i = 1; i < n; i++) {
			Set<Integer> set = new HashSet<Integer>();
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for (Integer integer : set) {
				if(min> integer) min = integer
						;
				if(max< integer) max = integer;
			}
			for (int j = min; j <= max; j++) {
				if(maxRange[])set.add(j);
			}
			first.retainAll(set);
		}
		return first.size();
	}

}