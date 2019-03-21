package Graphs;

import java.util.HashMap;
import java.util.Scanner;

public class NotebookRevision {
	public static class hello {
		public static void foo() {}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubscann s
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLong();
		}
		int k = sc.nextInt();
		int count = 0;
		long temp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (temp == arr[i]) {
				count++;
				temp = arr[i] * k;
			}
		}
		System.out.println(count);

		sc.close();

	}

}
