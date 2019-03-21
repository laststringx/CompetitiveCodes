import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class EncodeIt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String p = br.readLine();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < p.length(); i++) {
			map.put(p.charAt(i), i);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			int oldPosition = map.get(str.charAt(i));
			int newPosition = (int) (Math.pow(2, oldPosition) % 26);
			sb.append(p.charAt(newPosition));
		}
		System.out.println(sb.toString());
	}

}
