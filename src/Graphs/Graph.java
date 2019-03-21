package Graphs;

// Java program to print connected components in 
// an undirected graph 
import java.util.LinkedList;
import java.util.Scanner;

public class Graph {
	// A user define class to represent a graph.
	// A graph is an array of adjacency lists.
	// Size of array will be V (number of vertices
	// in graph)
	int V;
	LinkedList<Integer>[] adjListArray;

	// constructor
	Graph(int V) {
		this.V = V;
		// define the size of array as
		// number of vertices
		adjListArray = new LinkedList[V];

		// Create a new list for each vertex
		// such that adjacent nodes can be stored

		for (int i = 0; i < V; i++) {
			adjListArray[i] = new LinkedList<Integer>();
		}
	}

	// Adds an edge to an undirected graph
	void addEdge(int src, int dest) {
		// Add an edge from src to dest.
		adjListArray[src].add(dest);

		// Since graph is undirected, add an edge from dest
		// to src also
		adjListArray[dest].add(src);
	}

	void DFSUtil(int v, boolean[] visited) {
		// Mark the current node as visited and print it
		visited[v] = true;
		// System.out.print(v + " ");
		// Recur for all the vertices
		// adjacent to this vertex
		for (int x : adjListArray[v]) {
			if (!visited[x])
				DFSUtil(x, visited);
		}

	}

	boolean isBridge(int u, int v) {
		// Remove edge from undirected graph
		adjListArray[u].remove(v);
		adjListArray[v].remove(u);

		boolean res = isConnected();

		// Adding the edge back
		addEdge(u, v);

		// Return true if graph becomes disconnected
		// after removing the edge.
		return (res == false);
	}

	boolean isConnected() {
		boolean[] visited = new boolean[V];

		// Find all reachable vertices from first vertex
		DFSUtil(0, visited);

		// If set of reachable vertices includes all,
		// return true.
		for (int i = 0; i < V; i++)
			if (visited[i] == false)
				return false;

		return true;
	}

	void connectedComponents() {
		// Mark all the vertices as not visited
		int count = 0;
		boolean[] visited = new boolean[V];
		for (int v = 0; v < V; ++v) {
			if (!visited[v]) {
				// print all reachable vertices
				// from v
				DFSUtil(v, visited);
				count++;
				// System.out.println();
			}
		}
		System.out.println(count);
	}

	// Driver program to test above
	public static void main(String[] args) {
		// Create a graph given in the above diagram
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		Graph g = new Graph(n); // 5 vertices numbered from 0 to 4
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			g.addEdge(a, b);
		}
		System.out.println(g.isBridge(0, 2));
		// g.connectedComponents();
	}
}
