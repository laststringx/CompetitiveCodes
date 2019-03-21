import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LaptopDemand {

	/**
	 * @param args
	 */

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<String, Integer>();
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String str = br.readLine();
			if (map.containsKey(str)) {
				//int temp = map.get(str);
				//temp++;
				//map.replace(str, temp);
				map.put(str, map.get(str)+1);

			} else {
				map.put(str, 1);
			}

		}
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(map);
		// System.out.println(map.get(max));
		printMap(treeMap);
	}

	public static void printMap(Map<String, Integer> map) {
		int max = -1;
		ArrayList<String> answer = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > max)
				max = entry.getValue();
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max)
				answer.add(entry.getKey());
		}
		
			System.out.println(answer.get(0));
		
	}
}
