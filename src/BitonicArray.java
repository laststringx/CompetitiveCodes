import java.util.Scanner;

public class BitonicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int max = 0;
			for (int i = 0; i < n; i++) {

				if (arr[i] < max)
					break;
				if (arr[i] > max)
					max = arr[i];
			}
			System.out.println(max);
		}

	}

}
