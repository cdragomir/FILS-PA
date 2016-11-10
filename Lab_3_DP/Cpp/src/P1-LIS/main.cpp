#include<stdio.h>

/**
 * lis() should return the longest increasing subsequence of the given array
 * @param arr - input array
 * @param n - size of the array
 * @return - an integer representing the longest increasing subsequence
 */
int lis(int arr[], int n) {
    int lis[n], max = 0;

    /* TODO: Initialize LIS values for all indexes */
    
    /* TODO: Compute optimized LIS values in bottom up manner */
    
    /* TODO: Pick maximum of all LIS values */
    
    return max;
}

/* Driver program to test above function */
int main()
{
    int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
    int n = sizeof(arr)/sizeof(arr[0]);
    printf("Length of lis is %d\n", lis(arr, n) );
    return 0;
}