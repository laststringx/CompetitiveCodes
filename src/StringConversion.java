import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringConversion {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = br.readLine();
		String b = br.readLine();
		int out = solution(a, b);
		if (out == -1 || out == 0) {
			System.out.println("Not possible");
		} else
			System.out.println(out);

	}

	private static int solution(String a, String b) {
		int count = 0;
		int i = 0, j = 0;
		char x = '\0';
		char y = '\0';

		boolean flag = true;
		while (i < a.length() && j < b.length()) {
			if (a.charAt(i) == b.charAt(j)) {
				x = a.charAt(i);
				y = b.charAt(j);
				i++;
				j++;

			} else if (a.charAt(i) == x && b.charAt(j) != y) {
				x = a.charAt(i);
				count++;
				i++;

			} else if (a.charAt(i) != x && b.charAt(j) == y) {

				y = b.charAt(j);
				count++;
				j++;
			}
		}
		return count;
		/*
		 * if (removeDupliates(a).equals(removeDupliates(b))) {
		 * 
		 * count = Math.abs(a.length() - b.length()); }
		 * System.out.println(removeDupliates(a));
		 * System.out.println(removeDupliates(b)); return count;
		 */
	}

	/*
	 * private static String removeDupliates(String string) {
	 * 
	 * char[] chars = string.toCharArray(); Set<Character> charSet = new
	 * LinkedHashSet<Character>(); for (char c : chars) { charSet.add(c); }
	 * 
	 * StringBuilder sb = new StringBuilder(); for (Character character : charSet) {
	 * sb.append(character); } return sb.toString(); }
	 */
	/*
	 * private static String removeDupliates(String str) { char[] chars; chars =
	 * str.toCharArray(); char prev = '\0'; int k = 0;
	 * 
	 * for (int i = 0; i < chars.length; i++) { if (prev != chars[i]) { chars[k++] =
	 * chars[i]; prev = chars[i]; } }
	 * 
	 * return new String(chars).substring(0, k); }
	 */

}
