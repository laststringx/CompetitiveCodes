import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapChar {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String a = br.readLine();
			String b = br.readLine();
			boolean boolArray[] = new boolean[n];
			for (int i = 0; i < boolArray.length; i++) {
				if (a.charAt(i) == b.charAt(i))
					boolArray[i] = true;
			}
			int count = 0;
			for (int i = 0; i < boolArray.length; i++) {
				if (!boolArray[i])
					count++;
			}

			if (count > 2)
				System.out.println("NO");
			else if (count == 1)
				System.out.println("YES");
			else if (count == 2) {
				for (int i = 0; i < boolArray.length; i++) {
					if (!boolArray[i]) {
						if (a.charAt(i) == b.charAt(i)) {
							System.out.println("YES");
							break;
						}
						for (int j = i + 1; j < boolArray.length; j++) {
							if (!boolArray[j]) {
								if (a.charAt(j) == b.charAt(j)) {
									System.out.println("YES");
									break;
								} else if (a.charAt(i) == a.charAt(j) || a.charAt(i) == b.charAt(j)
										|| b.charAt(i) == b.charAt(j) || b.charAt(i) == a.charAt(j)) {
									System.out.println("YES");
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
