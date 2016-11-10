package P2;

public class LCS {

	/**
	 * lcs() should return the longest common subsequence given two strings
	 * @param X - first input string
	 * @param Y - second input string
	 * @return - an integer representing the longest common subsequence
	 */
	static int lcs(String X, String Y) {
		int m = X.length(), n = Y.length();
	    int[][] L = new int[m+1][n+1];

	    /* Build L[m+1][n+1] in bottom up fashion.
	     * Note that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
	    
	    /*========================================
	     *Write your code here
	     *========================================*/

	    /* L[m][n] contains length of LCS for X[0..n-1] and Y[0..m-1] */
	    /* Bonus: also print out the common subsequence with the maimum length */
	    return L[m][n];
	}
	
	public static void main(String args[]) {
		String x = "AGGTAB";
	    String y = "GXTXAYB";

	    System.out.println("Length of LCS is " + lcs(x, y));
    }
}
