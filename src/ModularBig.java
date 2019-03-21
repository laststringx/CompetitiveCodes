import java.util.Scanner;

public class ModularBig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			long res = (long) (Math.pow((a % c), b) % c);
			System.out.println(res);

		}
		sc.close();

	}

}
