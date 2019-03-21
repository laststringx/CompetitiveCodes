import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BombAndWall {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String str = br.readLine();
			int length = str.length();
			int count = 0;
			boolean flag;
			for (int i = 0; i < length; i++) {
				flag = false;
				if (str.charAt(i) == 'W') {
					if ((i - 1) >= 0) {
						if (str.charAt(i - 1) == 'B')
							flag = true;
					}
					if ((i - 2) >= 0) {
						if (str.charAt(i - 2) == 'B')
							flag = true;
					}
					if ((i + 1) <= length - 1) {
						if (str.charAt(i + 1) == 'B')
							flag = true;
					}
					if ((i + 2) <= length - 1) {
						if (str.charAt(i + 2) == 'B')
							flag = true;
					}
					if (flag)
						count++;
				}
			}
			System.out.println(count);
		}

	}
}
