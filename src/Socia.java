import java.io.*;
import java.util.*;

public class Socia {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String s[] = br.readLine().split(" ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(s[i]);
			}
			Arrays.parallelSort(arr);
			long cal = 0;
			int init = 0;
			for (int i = n - 1; i >= 0; i--) {
				cal += 2 * init + arr[i];
				init += arr[i];
			}
			System.out.println(cal);
		}

	}

}
