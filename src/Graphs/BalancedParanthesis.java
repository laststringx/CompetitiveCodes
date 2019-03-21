package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			System.out.println(getResult(br.readLine()) ? "balanced" : "not balanced");
		}

	}

	private static boolean getResult(String str) {
		// TODO Auto-generated method stub
		boolean flag = true;
		if (str.length() % 2 != 0)
			return false;
		Stack<Character> s = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '{' || ch == '(' || ch == '[') {
				s.push(ch);
			} else {
				if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']'))
					s.pop();
				else {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

}
