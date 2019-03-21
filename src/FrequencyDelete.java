import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class FrequencyDelete {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int[] freq = new int[26];
		for (int i = 0; i < n; i++) {
			freq[str.charAt(i) - 97]++;
		}
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < freq.length; i++) {
			set.add(freq[i]);
		}
		if (set.contains(0))
			set.remove(0);
		System.out.println(set.size());
	}
}
