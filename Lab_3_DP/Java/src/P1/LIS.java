package P1;

public class LIS {
    /**
     * lis() should return the longest increasing subsequence of the given array
     * @param arr - input array 
     * @return - an integer representing the longest increasing subsequence
     */
	static int lis(int arr[]) {
		int n = arr.length;
    	int lis[] = new int[n], max = 0;

        /* TODO: Initialize LIS values for all indexes */
        
        /* TODO: Compute optimized LIS values in bottom up manner */
        
        /* TODO: Pick maximum of all LIS values */
        
        return max;
	}
 
    public static void main(String args[]) {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        System.out.println("Length of lis is " + lis(arr));
    }
}