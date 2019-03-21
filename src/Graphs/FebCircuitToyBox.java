package Graphs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FebCircuitToyBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][2];

		Set<Integer> boxes = new HashSet<Integer>();

		int count = 0;
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if (o1[0] < o2[0])
					return 1;
				else
					return -1;
			}
		});
		for (int i = 0; i < n; i++) {
			if (!boxes.contains(arr[i][1])) {
				count += arr[i][0];
				boxes.add(arr[i][1]);
			}
		}
		System.out.println(count);
		sc.close();
	}

}
