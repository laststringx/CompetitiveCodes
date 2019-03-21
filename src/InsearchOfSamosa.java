import java.util.Arrays;
import java.util.Scanner;

public class InsearchOfSamosa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int count = 0;
		for (int j = 0; j < n; j++) {
			if (k >= arr[j]) {
				count++;
				k -= arr[j];
			}
		}
		
		if (k < 0)
			count--;
		System.out.println(count);
		sc.close();
	}

}
