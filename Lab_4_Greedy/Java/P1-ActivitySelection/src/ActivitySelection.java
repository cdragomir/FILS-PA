import java.util.Arrays;

public class ActivitySelection {
	
	/**
	 * This class holds the start and finish times of an appointment, and represents an interval
	 * It already extends Comparable so that it only compares the end of the interval, since that's what
	 * we're aiming for in this problem
	 */
	static class Interval implements Comparable<Interval> {
	    public int s, f;
	    public Interval(int s, int f) {
	        this.s = s;
	        this.f = f;
	    }
	    
		@Override
		public int compareTo(Interval o) {
			return this.f - o.f;
		}
	};
	
	/**
	 * Given a set of appointments, as an array of intervals, your task is to find and print the maximum number of 
	 * activities such that no two activities overlap (and print the activity time interval for each one).
	 * 
	 * This function prints a maximum set of activities that can be done by a single person, one at a time.
	 * intervals[] -->  An array that contains time intervals of all activities
	 */
	public static void printMaxActivities(Interval[] intervals) {
	    int n = intervals.length;

	    // TODO: Sort the intervals based on the end of the interval (f)
	    
	    System.out.println("Following activities are selected:");

	    // TODO: select the intervals so that they don't overlap
	}

	
	public static void main(String[] args) {
		Interval[] intervals = new Interval[] {
            new Interval(3, 4),
            new Interval(5, 7),
            new Interval(1, 2),
            new Interval(5, 9),
            new Interval(0, 6),
            new Interval(8, 9)
		};
		printMaxActivities(intervals);
	}

}
