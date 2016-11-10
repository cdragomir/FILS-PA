#include<stdio.h>
#include<string>

using namespace std;

/**
 * lcs() should return the longest common subsequence given two strings
 * @param X - first input string
 * @param Y - second input string
 * @return - an integer representing the longest common subsequence
 */
int lcs(char *X, char *Y, int m, int n ) {
    int L[m+1][n+1];

    /* Build L[m+1][n+1] in bottom up fashion.
     * Note that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
    
    /*========================================
     *Write your code here
     *========================================*/

    /* L[m][n] contains length of LCS for X[0..n-1] and Y[0..m-1] */
    /* Bonus: also print out the common subsequence with the maimum length */
    return L[m][n];
}

int main() {
    char X[] = "AGGTAB";
    char Y[] = "GXTXAYB";

    int m = strlen(X);
    int n = strlen(Y);

    printf("Length of LCS is %d\n", lcs( X, Y, m, n ) );

    return 0;
}