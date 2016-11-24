#include<stdio.h>
#include <algorithm>

using namespace std;

/**
 * This struct holds the start and finish times of an appointment, and represents an interval
 * It overloads the < operator so that when sorting, it only compares the end of the interval, since that's what
 * we're aiming for in this problem
 */
struct interval {
    int s, f;
    interval(int s, int f) {
        this->s = s;
        this->f = f;
    }
    bool operator<(const interval& rhs) const { return f < rhs.f; }
};

/**
 * Given a set of appointments, as an array of intervals, your task is to find and print the maximum number of
 * activities such that no two activities overlap (and print the activity time interval for each one).
 *
 * This function prints a maximum set of activities that can be done by a single person, one at a time.
 * n   -->  Total number of activities
 * intervals[] -->  An array that contains time intervals of all activities
 */
void printMaxActivities(interval intervals[], int n) {

    // TODO: Sort the intervals based on the end of the interval (f)
    
    printf ("Following activities are selected:\n");

    // TODO: select the intervals so that they don't overlap
}

int main() {
    interval intervals[] {
            interval(3, 4),
            interval(5, 7),
            interval(1, 2),
            interval(5, 9),
            interval(0, 6),
            interval(8, 9)
    };
    int n = sizeof(intervals) / sizeof(intervals[0]);
    printMaxActivities(intervals, n);
    return 0;
}
