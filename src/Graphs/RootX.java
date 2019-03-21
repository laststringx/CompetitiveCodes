package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RootX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		sc.close();
	}

}

class Node<T> {
	private List<Node<T>> children = new ArrayList<Node<T>>();
	private Node<T> parent = null;
	private T data = null;

	public Node(T data) {
		this.data = data;
	}

	public Node(T data, Node<T> parent) {
		this.data = data;
		this.parent = parent;
	}

	public List<Node<T>> getChildren() {
		return children;
	}

	public void setParent(Node<T> parent) {
		parent.addChild(this);
		this.parent = parent;
	}

	public void addChild(T data) {
		Node<T> child = new Node<T>(data);
		child.setParent(this);
		this.children.add(child);
	}

	public void addChild(Node<T> child) {
		child.setParent(this);
		this.children.add(child);
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public boolean isRoot() {
		return (this.parent == null);
	}

	public boolean isLeaf() {
		return this.children.size() == 0;
	}

	public void removeParent() {
		this.parent = null;
	}
}