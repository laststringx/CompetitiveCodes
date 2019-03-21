package Graphs;

import java.util.HashMap;

public class LongestSubarrayWith0Sum {
	int getnumber(int arr[], int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
		int maxLength = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0 && maxLength == 0) {
				maxLength = 1;
			}
			if (sum == 0) {

				maxLength=i+1;
			}
			Integer temp = map.get(sum);
			if (temp != null) {
				maxLength = Math.max(i - temp, maxLength);
			} else
				map.put(sum, i);
		}
		return maxLength;

	}
}
