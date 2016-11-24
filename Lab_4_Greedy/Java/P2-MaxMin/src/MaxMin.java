import java.util.Arrays;

public class MaxMin {

	/**
	 * Given a list of N integers, your task is to select K integers from the list such that its unfairness is minimized.
	 * if (x1, x2, ... xk) are K numbers selected from the list N, the unfairness is defined as
	 * max(x1, x2, ... xk) - min(x1, x2, ... xk)
	 * where max denotes the largest integer among the elements of K, and min denotes the smallest integer among the
	 * elements of K.
	 *
	 * Solve should return an integer that denotes the minimum possible value of unfairness.
	 */
	public static int solve(int[] x, int k) {
		int n = x.length;
        //TODO: sort the integers
        
        //TODO: iterate and find the minimum possible value of unfairness

	    return max_min;
	}

	
	public static void main(String[] args) {
		int k = 3;
	    int x[] = {10, 100, 300, 200, 1000, 20, 30};

	    int max_min = solve(x, k);

	    System.out.println(max_min);
	}

}
