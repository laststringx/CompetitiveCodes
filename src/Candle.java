import java.util.Scanner;

public class Candle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 5;
		int temp = 0;
		int total = n / 5;
		int first=n%k;
		System.out.println(total);
		int t=total;
		while (true) {
			t = t / k;
			total += t;
			temp = t % k;
			t+=temp;
			if(t+temp<k) break;
		}
		System.out.println(total);
	}
}