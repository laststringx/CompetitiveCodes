import java.util.Scanner;

public class SingleOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int prevElement = arr[0];
			int nextElement = arr[2];
			for (int i = 1; i < arr.length; i++) {
				if (prevElement != arr[i] && nextElement != arr[i]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
