import java.util.Scanner;

public class FunAtCakeShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		int i = 1;
		String answer = "";
		while (x > 0) {

			if ((x - i) <= 0) {
				answer = "Darshak";
				break;
			}
			x -= i;
			if ((x - i * i) <= 0) {
				answer = "Chandan";
				break;
			}
			x -= i * i;
			i++;
		}
		System.out.println(answer);
		sc.close();
	}

}
