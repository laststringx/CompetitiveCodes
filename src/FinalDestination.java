import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalDestination {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int length = str.length();
		int x = 0, y = 0;
		for (int i = 0; i < length; i++) {
			int c = str.charAt(i);
			switch (c) {
			case 'U':
				y++;
				break;
			case 'D':
				y--;
				break;
			case 'R':
				x++;
				break;
			case 'L':
				x--;
				break;

			default:
				break;
			}
		}
		System.out.println(x+" "+y);
	}

}
