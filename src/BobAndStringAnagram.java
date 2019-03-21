import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BobAndStringAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String s1 = br.readLine();
			String s2 = br.readLine();
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			int a[] = new int[26];
			int b[] = new int[26];
			int count = 0;
			for (int i = 0; i < s1.length(); i++) {
				a[s1.charAt(i) - 97]++;
			}
			for (int i = 0; i < s2.length(); i++) {
				b[s2.charAt(i) - 97]++;
			}
			for (int i = 0; i < 26; i++) {
				if (a[i] != b[i]) {
					count += (Math.abs(a[i] - b[i]));
				}
			}
			System.out.println(count);

		}

	}

}
