import java.util.Scanner;

public class AbsoluteDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		boolean flag;
		while (t-- > 0) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			flag = true;
			for (int i = 0; i < n - 1; i++) {
				if (Math.abs(arr[i] - arr[i + 1]) > d) {
					// System.out.println(Math.abs(arr[i]-arr[i+1]));
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
