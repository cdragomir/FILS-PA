// Cristian Ojog, FILS Algorithm Design Lab, 2016-2017
package P1;


import java.io.File;
import java.util.Scanner;

public class BinarySearch {

	public int numTests;
	public int[][] haystacks;
	public int[][] needles;
	
	private int searchLeftmost(int left, int right, int needle, int[] haystack) {
		// TODO: return the position of the leftmost occurrence of the needle
		return 0;
	}
	
	private int searchRightmost(int left, int right, int needle, int[] haystack) {
		// TODO: return the position of the rightmost occurrence of the needle
		return 0;
	}
	
	public int solve(int needle, int[] haystack) {
		// TODO: find the number of occurrences of the needle in the haystack
		// Hint: if we can find the leftmost occurrence of the needle and the rightmost one, 
		// we could simply return the number of elements in-between those two
		// Edge-case: what happens when there is no needle in the haystack?
		return 0;
	}
	
	public void runTests() {
		for (int t = 0; t < numTests; t++) {
			System.out.println("Test " + t);
			for (int x : haystacks[t]) {
				System.out.print(x + " ");
			}
			System.out.println();
			
			for (int needle: needles[t]) {
				int numOccurrences = solve(needle, haystacks[t]);
				if (numOccurrences != -1) {
					System.out.println(needle + " has " + numOccurrences + " occurences");
				} else {
					System.out.println(needle + " does not appear in the array");
				}
			}
		}
	}
	
	public void read(String source) {
		Scanner scanner = null;

		try {
			scanner = new Scanner(new File(source));
			numTests = scanner.nextInt();
			haystacks = new int[numTests][];
			needles = new int[numTests][];
			
			for (int i = 0; i < numTests; i++){
				int n = scanner.nextInt();
				haystacks[i] = new int[n];
				for (int j = 0; j < n; j++) {
					haystacks[i][j] = scanner.nextInt();
				}
				
				n = scanner.nextInt();
				needles[i] = new int[n];
				for (int j = 0; j < n; j++) {
					needles[i][j] = scanner.nextInt();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (scanner != null) scanner.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		BinarySearch p = new BinarySearch();
		p.read("binarySearch.in");
		p.runTests();
	}

}
