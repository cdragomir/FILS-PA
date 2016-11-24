#include <cmath>
#include <cstdio>
#include <algorithm>

using namespace std;

/**
 * Given a list of N integers, your task is to select K integers from the list such that its unfairness is minimized.
 * if (x1, x2, ... xk) are K numbers selected from the list N, the unfairness is defined as
 * max(x1, x2, ... xk) - min(x1, x2, ... xk)
 * where max denotes the largest integer among the elements of K, and min denotes the smallest integer among the
 * elements of K.
 *
 * Solve should return an integer that denotes the minimum possible value of unfairness.
 */
int solve(int x[], int n, int k) {
    //TODO: sort the integers
    
    //TODO: iterate and find the minimum possible value of unfairness
    
    return 0;
}

int main() {
    int k = 3;
    int x[] = {10, 100, 300, 200, 1000, 20, 30};
    int n = sizeof(x) / sizeof(x[0]);

    int unfairness = solve(x, n, k);

    printf("%d\n", unfairness);
    return 0;
}
