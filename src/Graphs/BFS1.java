package Graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Graph1 {
	private int v;
	private LinkedList<Integer> adj[];

	public Graph1(int v, LinkedList<Integer>[] adj) {
		this.v = v;
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList<Integer>();
		}

	}

	void addEdge(int v, int u) {
		adj[v].add(u);
		adj[u].add(v);
	}

	void BFS(int s) {
		boolean visited[] = new boolean[v];
		Queue<Integer> queue = new LinkedList<Integer>();

		visited[s] = true;
		queue.add(s);
		while (queue.size() != 0) {
			s = queue.peek();
			System.out.print(s + " ");

			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
}