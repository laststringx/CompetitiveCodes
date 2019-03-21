package Graphs;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayInGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			long arr[] = new long[n];
			long tempArr[] = new long[k];
			int count = 0;
			int j = 0;

			while (n-- >= 0) {
				if (count == k) {
					for (int i = k - 1; i >= 0; i--) {
						arr[j] = tempArr[i];
						j++;
					}
					count = 0;
					Arrays.fill(tempArr, 0);

				} else {
					tempArr[count] = sc.nextLong();

					count++;
				}

			}
			int k1 = k-1;
			while(tempArr[k1--]==0);
			k1++;
			while(k1>=0) {
				arr[j++] = tempArr[k1--];
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		sc.close();

	}

}
