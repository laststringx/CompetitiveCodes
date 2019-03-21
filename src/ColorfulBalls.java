import java.util.Arrays;
import java.util.Scanner;

public class ColorfulBalls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int arr[] = { a, b, c, d };
		Arrays.sort(arr);
		long answer = fact(arr[3]);

		answer = answer * (fact(arr[2]));
		answer = answer * (fact(arr[1]));
		answer = answer * (fact(arr[0]));
answer/=(a+b+c+d);
		System.out.println(answer);
	}

	public static int fact(int num) {
		if (num <= 0)
			return 1;
		int fact = 1, i;
		for (i = 1; i <= num; i++)
			fact = fact * i;
		return fact;
	}
}
