import java.util.Arrays;
import java.util.Scanner;

public class APOrNot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long arr[] = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
			}
			Arrays.sort(arr);
			boolean flag = true;
			long diff = arr[0] - arr[1];
			for (int i = 1; i < n - 1; i++) {
				if ((arr[i] - arr[i + 1]) != diff) {
					flag = false;
					break;
				}
			}
			System.out.println((flag) ? "YES" : "NO");
		}

	}

}
