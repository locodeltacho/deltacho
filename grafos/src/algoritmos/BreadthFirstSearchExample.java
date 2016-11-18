package algoritmos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchExample {

	private Queue<Node> queue;
	static ArrayList<Node> nodes = new ArrayList<Node>();

	static class Node {
		int data;
		boolean visited;

		Node(int data) {
			this.data = data;

		}
	}

	public BreadthFirstSearchExample() {
		queue = new LinkedList<Node>();
	}

	// find neighbors of node using adjacency matrix
	// if adjacency_matrix[i][j]==1, then nodes at index i and index j are
	// connected
	public ArrayList<Node> findNeighbours(int adjacency_matrix[][], Node x) {
		int nodeIndex = -1;

		ArrayList<Node> neighbours = new ArrayList<Node>();
		/**
		 * Se fija si el nodo a buscar existe
		 */
		for (int i = 0; i < nodes.size(); i++) {
			if (nodes.get(i).equals(x)) {
				nodeIndex = i;
				break;
			}
		}
		/**
		 * Si existe, añade los vecinos del nodo
		 */
		if (nodeIndex != -1) {
			for (int j = 0; j < adjacency_matrix[nodeIndex].length; j++) {
				if (adjacency_matrix[nodeIndex][j] == 1) {
					neighbours.add(nodes.get(j));
				}
			}
		}
		return neighbours;
	}

	public void bfs(int adjacency_matrix[][], Node node) {
		queue.add(node);
		node.visited = true;
		while (!queue.isEmpty()) {

			Node element = queue.remove();
			System.out.print(element.data + "\t");
			ArrayList<Node> neighbours = findNeighbours(adjacency_matrix,
					element);

			for (Node aux : neighbours) {
				if (aux != null && !aux.visited) {
					queue.add(aux);
					aux.visited = true;
				}
			}
		}

	}

	public void dfs(int adjacency_matrix[][], Node node) {

		System.out.print(node.data + "\t");
		ArrayList<Node> neighbours = findNeighbours(adjacency_matrix, node);
		
		for(Node nodo:neighbours){
			if (nodo != null && !nodo.visited) {
				dfs(adjacency_matrix, nodo);
				nodo.visited = true;
			}
		}
		
	}

	public static void main(String arg[]) {

		Node node40 = new Node(40);
		Node node10 = new Node(10);
		Node node20 = new Node(20);
		Node node30 = new Node(30);
		Node node60 = new Node(60);
		Node node50 = new Node(50);
		Node node70 = new Node(70);

		nodes.add(node40);
		nodes.add(node10);
		nodes.add(node20);
		nodes.add(node30);
		nodes.add(node60);
		nodes.add(node50);
		nodes.add(node70);
		int adjacency_matrix[][] = { { 0, 1, 1, 0, 0, 0, 0 }, // Node 1: 40
				{ 0, 0, 0, 1, 0, 0, 0 }, // Node 2 :10
				{ 0, 1, 0, 1, 1, 1, 0 }, // Node 3: 20
				{ 0, 0, 0, 0, 1, 0, 0 }, // Node 4: 30
				{ 0, 0, 0, 0, 0, 0, 1 }, // Node 5: 60
				{ 0, 0, 0, 0, 0, 0, 1 }, // Node 6: 50
				{ 0, 0, 0, 0, 0, 0, 0 }, // Node 7: 70
		};
		System.out.println("The BFS traversal of the graph is ");
		BreadthFirstSearchExample bfsExample = new BreadthFirstSearchExample();
		bfsExample.bfs(adjacency_matrix, node40);

	}
}

// Read more at
// http://www.java2blog.com/2015/12/breadth-first-search-in-java.html#VmK3TEsjY73MuZrT.99