import java.util.Scanner;

public class PrateekBirthdayParty {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long x = sc.nextLong();
			int start = 0;
			boolean flag = false;
			long total = 0;
			long temp = 0;
			long arr[] = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
			}
			for (int i = 0; i < n; i++) {
				start=i;
				for (int j = i; j < n; j++) {

					total += arr[j];
					if (total == x) {
						flag = true;
						break;
					} else if (total > x) {
						total = 0;
						break;
					}
				}
				if(flag) break;
			}
			System.out.println(flag);
		}

	}

}
