import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


enum CellType {
	FREE, OBSTACLE, EXIT
}

class Cell {
	int x;
	int y;
	CellType type;
	
	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Room {

	/* Dimension of the matrix corresponding to the map of the room */
	int dim;

	/* The map of the room */
	CellType[][] map;

	/* Starting point from where you should calculate the minimum distance
	 * to an exit point on the map */
	Cell startPoint = new Cell(0, 0);

	/**
	 * Read and parse the data from the input file
	 * @param filename
	 */
	void loadRoomFromFile(String filename) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(filename));

			dim = sc.nextInt();
			map = new CellType[dim][];
			for (int row = 0; row < dim; row++) {
				map[row] = new CellType[dim];
			}

			for (int row = 0; row < dim; row++) {
				for (int col = 0; col < dim; col++) {
					map[row][col] = CellType.OBSTACLE;
					int val = sc.nextInt();
					if (val == 0) {
						map[row][col] = CellType.FREE;
					} else if (val == 2) {
						map[row][col] = CellType.EXIT;
					}
				}
			}
			startPoint.x = sc.nextInt();
			startPoint.y = sc.nextInt();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (sc != null) {
					sc.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}

public class P1 {

	Room room;

	/* Holds the optimal path to an exit on the map */
	List<Cell> solution;

	/* Auxiliary matrix to hold the min distances between the starting point
	 * and the current point on the map */
	int[][] distances;

	/* Queue used in the BFS algorithm */
	Queue<Cell> q;

	/* Constructor used for reading the input and initializations */
	P1(String loadFile) {
		room = new Room();
		room.loadRoomFromFile(loadFile);

		solution = new ArrayList<>();
		distances = new int[room.dim][];
		for (int row = 0; row < room.dim; row++) {
			distances[row] = new int[room.dim];
		}
		for (int row = 0; row < room.dim; row++) {
			for (int col = 0; col < room.dim; col++) {
				distances[row][col] = Integer.MAX_VALUE;
			}
		}
		q = new LinkedList<>();
	}

	/**
	 * Find the minimum path in terms of cell walked between a starting point
	 * and an exit on the map of the Room
	 */
	Cell findMinPathValue() {
		//TODO
		// apply the breadth first search algorithm
		// use the Room to handle the map of the room and the starting point
		
        // Return null when the path can't be found
		return null;
	}

	void rebuildMinPath(Cell exit) {
		//TODO
		// using the distances matrix, rebuild the optimal path between the
		// starting point and the found exit
		// save the path in solution
		// CORNER CASE 1: what if there is no path to any of the exits?
		
	}

	void showMinPath() {
		Cell exit = findMinPathValue();
		rebuildMinPath(exit);
		// Uncomment this if you need to debug your distances matrix
		/*
		for (int i = 0; i < distances.length; i++) {
			for (int j = 0; j < distances[i].length; j++) {
				if (distances[i][j] != Integer.MAX_VALUE) {
					System.out.print(distances[i][j] + "  ");
				} else {
					System.out.print("∞  ");
				}
			}
			System.out.println();
		}
		*/
		//TODO
		// print the path, one cell on each line (stdout)
	}

	public static void main(String[] argv) {
		// three tests to pass
		String[] testFiles = {"room1.in", "room2.in", "room3.in"};

		P1[] p = new P1[testFiles.length];
		for (int test = 0; test < testFiles.length; test++) {
			System.out.println("Testing file " + testFiles[test] + ":");
			p[test] = new P1(testFiles[test]);
			p[test].showMinPath();
		}
	}
}
