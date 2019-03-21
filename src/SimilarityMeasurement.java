import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SimilarityMeasurement {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		int q = Integer.parseInt(br.readLine());
		while (q-- > 0) {
			String query[] = br.readLine().split(" ");
			if (query.length == 3) {
				// update
				arr[Integer.parseInt(query[1]) - 1] = Integer.parseInt(query[2]);
			} else if (query.length == 2) {
				// query
				int pos = Integer.parseInt(query[1]) - 1;
				int temp = pos;
				int val = arr[pos];
				int count=0;
				while (temp-->0) {
					if(val!=arr[temp]) break;
				} 
					
				System.out.println(temp+2);
			}
		}

	}
}
