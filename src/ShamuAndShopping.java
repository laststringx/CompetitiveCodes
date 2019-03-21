import java.util.Scanner;

public class ShamuAndShopping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int shirt[] = new int[n];
			int[] pant = new int[n];
			int[] shoe = new int[n];
			for (int i = 0; i < n; i++) {
				shirt[i]=sc.nextInt();
				pant[i]=sc.nextInt();
				shoe[i]=sc.nextInt();
			}
		}

	}

}
