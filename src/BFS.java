import java.util.LinkedList;

public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main(args);

	}

}

class Graph1{
	int v;
	LinkedList<Integer> adjList[];

	public Graph1(int v) {
		this.v = v;
		adjList = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
		// TODO Auto-generated constructor stub
	}
}