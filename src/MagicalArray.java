import java.util.Arrays;
import java.util.Scanner;

public class MagicalArray {
	public static void main(String[] args) {
		int num = 0;
		int prime1[] = new int[200];
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				prime1[count++] = i * i;
			}
		}
		System.out.println("count" + count);
		int prime[] = new int[count];
		for (int i = 0; i < prime.length; i++) {
			prime[i] = prime1[i];
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		int diff[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			for (int j = 0; j < diff.length; j++) {
				if (arr[i] < 4) {
					diff[i] = 4 - arr[i];
				} else if (arr[i] == prime[j]) {
					diff[i] = 0;

				} else if (arr[i] > prime[j] && arr[i] < prime[j + 1]) {
					diff[i] = Math.min(Math.abs(prime[j] - arr[i]), Math.abs(prime[j + 1] - arr[i]));
				}
			}
		}
		int answer = 0;
		Arrays.sort(diff);
		for (int i = 0; i < k; i++) {
			answer += diff[i];
		}
		answer += (n - k);
		System.out.println(answer);

	}
}
