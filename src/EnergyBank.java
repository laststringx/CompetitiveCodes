import java.util.Arrays;
import java.util.Scanner;

public class EnergyBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
			sum += arr[i];
		}
		Arrays.sort(arr);
		System.out.println(sum - arr[n - 1]);
		sc.close();
	}

}
