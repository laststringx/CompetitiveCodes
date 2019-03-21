package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlmostVowel {
	public static boolean isVowel(char c) {
		return "aeiou".indexOf(c) != -1;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String str = br.readLine();
			boolean arr[] = new boolean[str.length()];
			for (int i = 0; i < arr.length; i++) {
				if (isVowel(str.charAt(i)))
					arr[i] = true;
			}
			int breaks = 0;
			int max = 0;
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]) {
					count++;
				}
				
			}
			
		}
	}

}
