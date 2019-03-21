import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class UniqueMaximumNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];
		// scan
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		// sort
		Arrays.sort(arr);
		// scan from last
		long answer = -1;
		long temp1;
		long temp2;
		int count = 1;
		for (int i = n - 1; i > 0; i--) {
			temp1 = arr[i];
			temp2 = arr[i - 1];
			if (temp1 == temp2)
				count++;
			else {
				if (count == 1) {
					answer = temp1;
					break;
				} else
					count = 1;
			}

		}
		// System.out.println(answer);
		if (answer == -1) {
			if (arr[0] != arr[1])
				answer = arr[0];
		}

		System.out.println(answer);
	}
}