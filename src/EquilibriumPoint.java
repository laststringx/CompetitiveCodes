import java.util.Scanner;

public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			long sum = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			long sum1 = 0;
			int i;
			for (i = 0; i < arr.length; i++) {
				sum1 += arr[i];
				if (sum == sum1)
					break;
				sum -= arr[i];
			}
			System.out.println(i + 1);
		}
		sc.close();

	}

}
