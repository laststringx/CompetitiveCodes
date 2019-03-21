import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GuestList {

	/**
	 * @param args
	 */
	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
		// only got here if we didn't return false
		return true;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub\
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);
		ArrayList arr = new ArrayList();
		for (int i = 0; i < n; i++) {
			arr.add(br.readLine());
		}
		int count = 0;
		for (int i = 0; i < q; i++) {
			String s = br.readLine();
			if (isInteger(s)) {
				if (Integer.parseInt(s) <= 20) {
					count++;
				}
			} else {
				if (!arr.contains(s)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
