import java.util.Arrays;
import java.util.Scanner;

public class BobAlice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long bob[] = new long[n];
			long alice[] = new long[n];
			for (int i = 0; i < n; i++) {
				bob[i] = sc.nextLong();
			}
			for (int i = 0; i < n; i++) {
				alice[i] = sc.nextLong();
			}

			int bobCount = 0;
			int aliceCount = 0;

			for (int i = n - 1; i >= 0; i--) {
				if (bob[i] == alice[i]) {
					bobCount++;
					aliceCount++;
				} else if (bob[i] > alice[i])
					bobCount++;
				else if (bob[i] < alice[i])
					aliceCount++;

			}
		
			if (bobCount > aliceCount)
				System.out.println("Bob");
			else if (bobCount < aliceCount)
				System.out.println("Alice");
			else
				System.out.println("Tie");
		}
	}

}
