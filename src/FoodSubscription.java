import java.util.Arrays;
import java.util.Scanner;

public class FoodSubscription {
	static final int MONTH = 2499;
	static final int WEEK = 699;
	static final int DAY = 199;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int min = solution(arr);
		System.out.println(Math.min(min, MONTH));
		sc.close();
	}

	private static int solution(int[] arr) {
		// TODO Auto-generated method stub
		int[] dynamic = new int[arr.length];
		dynamic[0] = DAY;
		for (int i = 1; i < arr.length; i++) {
			int day = DAY + dynamic[i - 1];
			int j = i - 1;

			while (j >= 0 && arr[j] >= arr[i] - 6)
				j--;
			int week = WEEK;
			if (j >= 0)
				week += dynamic[j];
			dynamic[i] = Math.min(day, week);

		}
		return dynamic[dynamic.length - 1];
	}

}