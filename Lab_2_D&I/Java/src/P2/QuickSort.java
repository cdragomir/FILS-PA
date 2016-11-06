// Cosmin Dragomir, FILS Algorithm Design Lab, 2016-2017

package P2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuickSort {

	private int[][] arr;
	
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
	}
	
	public QuickSort() {
		readData("qs.in");
		test();
	}
	
	/**
	 * Reads the arrays from the input file. 
	 * @param filename
	 */
	private void readData(String filename) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(filename));
			int testsNum = sc.nextInt();
			arr = new int[testsNum][];
			// Read the arrays
			for (int i = 0; i < testsNum; i++) {
				int size = sc.nextInt();
				arr[i] = new int[size];
				for (int j = 0; j < size; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (sc != null) sc.close();
		}
	}
	
	private void test() {
		boolean allSorted = true;
		
		// Sort each array using QuickSort and then check if they are really sorted
		for (int[] v : arr) {
			sort(v, 0, v.length - 1);
			System.out.println("Your sorted array is:");
			for (int elem : v) {
				System.out.print(elem + " ");
			}
			System.out.println();
			// Check if the array is really sorted
			for (int i = 1; i < v.length; i++) {
				if (v[i] < v[i-1]) {
					System.out.println("The array is not sorted correctly");
					allSorted = false;
					break;
				}
			}
			System.out.println();
		}
		
		if (allSorted) {
			System.out.println("Congrats. Everything is sorted.");
		} else {
			System.out.println("Not all arrays are sorted. You should try again.");
		}
	}
	
	private int partition(int[] arr, int left, int right) {
		/* TODO
		 * Move the values lower than the pivot to the left of the array.
		 * Move the values bigger than the pivot to the right of the array.
		 */
		
		return 0;
	}
	
	private void sort(int[] arr, int left, int right) {
		/* TODO
		 * Use the partition method to divide the array in two sub-arrays.
		 * Recursively sort the two sub-arrays, by using left, right and
		 * the value returned by the partition method.
		 */
	}
	
	private int kthMin(int[] arr, int left, int right, int k) {
		/* TODO bonus
		 * Use the partition method to divide the array in two sub-arrays.
		 * Find out in which sub-array is our kthMin value and then recursively search for it.
		 * Hint: stop when we have already found our position.
		 */
		return -1;
	}
	
}
