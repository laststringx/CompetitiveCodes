package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Cache {
	int key;
	int value;

	public Cache(int key, int value) {
		super();
		this.key = key;
		this.value = value;
	}

}

public class LRUCache {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {

			int n = Integer.parseInt(br.readLine());
			int q = Integer.parseInt(br.readLine());
			Queue<Cache> cache = new LinkedList<Cache>();
			String str[] = br.readLine().split(" ");
			int mark = 0;
			while (q-- > 0) {
				if (str[mark].equals("GET")) {
					int val = -1;
					int k = Integer.parseInt(str[++mark]);
					for (Cache c : cache) {
						if (c.key == k) {
							val = c.value;

						}
					}
					System.out.print(val + " ");
					mark++;
				} else {
					// mark ++ thrice
					if (cache.size() == n) {
						cache.remove();
					}
					int k = Integer.parseInt(str[++mark]);
					int val = Integer.parseInt(str[++mark]);
					cache.add(new Cache(k, val));
					mark++;
				}
			}
			System.out.println();
		}
	}

}
