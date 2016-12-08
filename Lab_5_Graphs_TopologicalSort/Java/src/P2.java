import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P2 {

	/* Use to read, parse and write the output of the problem */
	private ReaderWriter rw;


	/* The graph of dependencies between subjects held as an adjacency matrix */
	private List<List<Integer>> graph;

	/* This stack is updated with each finalized node in the DFS and will hold the final solution */
	private Stack<Integer> solution;
	
	public P2(String fileName) {
		rw = new ReaderWriter(fileName);
		graph = rw.parseInput();
		solution = new Stack<Integer>();
	}

	/**
	 * Implements the DFS algorithm. Recursively visit each neighbor of the given node.
	 * Also update the solution stack with each finalized node.
	 * @param visited - Keeps a list of all the visited nodes.
	 * @param i - current node index
	 */
	void dfs(boolean[] visited, int i) {
		// TODO
	}
	
	/**
	 * Apply a topological sort algorithm to find the correct order
	 * of subjects to be studied
	 */
	void topologicalSort() {
		// TODO
		// use the graph adjacency list
		// perform a DFS algorithm on it
		// save the finalizing times for each node

	}


	void printSolution() {
		ArrayList<Integer> sol = new ArrayList<Integer>();
		while (!solution.isEmpty()) {
			sol.add(solution.pop());
		}
		rw.writeSolution(sol);
	}

	public static void main(String[] argv) {
		// create an object of type P2 and use it to solve our problem
		P2 p = new P2("subjects.in");

        p.topologicalSort();
		p.printSolution();
	}
}
