import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OZandStrings2 {

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
			String numbersInput[] = br.readLine().split(" ");
			int n = Integer.parseInt(numbersInput[0]);
			int numO = Integer.parseInt(numbersInput[1]);
			int numZ = Integer.parseInt(numbersInput[2]);
			String[] strings = br.readLine().split(" ");
			int answer = 0;
			int o, z;
			for (int i = 0; i < n; i++) {
				o = 0;
				z = 0;

				for (int j = 0; j < strings[i].length(); j++) {
					if (strings[i].charAt(j) == 'O')
						o++;
					else
						z++;
				}
				if (numO >= o && numZ >= z) {
					answer++;
					numO -= o;
					numZ -= z;
				}
			}
			System.out.println(answer);

		}
	}

}
