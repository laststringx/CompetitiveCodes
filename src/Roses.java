import java.util.Scanner;

public class Roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int count = 0;
			int one = 0;
			int two = 0;
			boolean isOdd = true;
			for (int i = 0; i < arr.length - 1; i++) {

				if (isOdd) {
					one += arr[i];
					two += arr[i + 1];
					toggle(isOdd);
				} else {
					one -= arr[i];
					two -= arr[i + 1];
					toggle(isOdd);
				}
				count += Math.max(one, two);

			}
			System.out.println(count);
		}
		sc.close();

	}

	private static boolean toggle(boolean isOdd) {
		// TODO Auto-generated method stub
		return (isOdd) ? false : true;

	}

}
