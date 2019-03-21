import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequentPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				int key = sc.nextInt();
				if (map.containsKey(key)) {
					map.put(key, map.get(key) + 1);
				} else
					map.put(key, 1);
			}
			while (k-- > 0) {
				
			}
		}
		sc.close();
	}

}
