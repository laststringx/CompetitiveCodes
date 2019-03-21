import java.util.LinkedList;
import java.util.Scanner;

public class PrimeNodesTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Graph graph = new Graph(n);
		for (int i = 0; i < n - 1; i++) {
			Graph.addEdge(graph, sc.nextInt() - 1, sc.nextInt() - 1);
		}
		Graph.printPrimeNodes(graph);
		sc.close();
	}

}

class Graph {
	int V;
	LinkedList<Integer> adjListArray[];

	Graph(int V) {
		this.V = V;

		adjListArray = new LinkedList[V];
		for (int i = 0; i < V; i++) {
			adjListArray[i] = new LinkedList<Integer>();
		}
	}

	static void addEdge(Graph graph, int src, int dest) {
		graph.adjListArray[src].add(dest);
		graph.adjListArray[dest].add(src);
	}

	static void printPrimeNodes(Graph graph) {
		int countTotalPrimeNodes = 0;
		for (int v = 0; v < graph.V; v++) {
			int sum = 0;
			for (Integer pCrawl : graph.adjListArray[v]) {
				if (pCrawl > v) {
					sum += (pCrawl + 1);
				}
			}
			if (sum > 0 && isPrime(sum))
				countTotalPrimeNodes++;
		}
		System.out.println(countTotalPrimeNodes);
	}

	public static boolean isPrime(int num) {
		if (num > 2 && num % 2 == 0) {

			return false;
		}
		int top = (int) Math.sqrt(num) + 1;
		for (int i = 3; i < top; i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}