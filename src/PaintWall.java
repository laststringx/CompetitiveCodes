import java.util.Scanner;

public class PaintWall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long answer = (long) ((3 * power(n-1)) % 1000000007);
			System.out.println(answer);
		}

	}

	static private long power(long n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
		long result=2;
		for (int i =1; i <n; i++) {
			result=((result%1000000007)*2)%1000000007;
		}
		return result;
	}
}
