import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MaxLengthSubString0 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		System.out.println(printLength(str, n));
	}

	private static int printLength(String str, int length) {
		// TODO Auto-generated method stub
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0, current = 0;
		for (int i = 0; i < length; i++) {
			if (str.charAt(i) == '0')
				sum++;
			else
				sum--;
			if (sum > 0)
				max = i + 1;
			else if (sum <= 0) {
				if (map.containsKey(sum - 1)) {
					current = i - map.get(sum - 1);
					max = Math.max(current, max);
				}
				if (!map.containsKey(sum)) {
					map.put(sum, i);
				}
			}
		}
		return max;
	}

}
