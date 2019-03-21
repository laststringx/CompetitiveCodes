package Graphs;

import java.util.Scanner;
import java.util.Stack;

public class PatternPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a = n;
			boolean f2 = true;
			Stack<Integer> s1 = new Stack<Integer>();
			for (int i = 0; i < n * 2 - 1; i++) {
				if (i < n) {
					for (int j = 0; j < n * 2 - 1; j++) {
						Stack<Integer> s = new Stack<Integer>();
						boolean f = true;
						while (f) {
							if (i < n && j < n) {
								int te = n - (Math.min(i, j));
								System.out.print(te + " ");
								s.push(te);
								s1.push(te);
								j++;
								if (s.size() == n) {
									f = false;
									break;
								}
							}
						}
						s.pop();
						while (!s.isEmpty()) {
							int t1 = s.pop();
							System.out.print(t1 + " ");
							s1.push(t1);
							j++;
						}

					}
					System.out.println();
				} else {
					if (f2) {
						for (int j = 0; j < n * 2 - 1; j++) {
							s1.pop();
						}
						f2 = false;
					}
					int t2 = 0;
					while (!s1.isEmpty() && t2 < n * 2 - 1) {
						System.out.print(s1.pop() + " ");
						t2++;
					}
					System.out.println();
				}
			}
		}

	}

}
