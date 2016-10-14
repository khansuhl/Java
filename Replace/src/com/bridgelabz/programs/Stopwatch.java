/*
Simulate Stopwatch Program
a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
   the start and end clicks
b. I/P -> Start the Stopwatch and End the Stopwatch
c. Logic -> Measure the elapsed time between start and end
d. O/P -> Print the elapsed time.
*/

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

class countdown {
	double start, stop, elapsed;

	public void start_time() {
		start = System.currentTimeMillis();
	}

	public double elapsed_time() {
		stop = System.currentTimeMillis();
		elapsed = (stop - start) / 1000.0;
		return elapsed;
	}
}

public class Stopwatch {

	public static void main(String[] args) {

		// INITIALIZATION
		Utility u = new Utility();
		int n, sum = 0;
		double time;
		System.out.print("Enter value of n: ");
		n = u.inputInteger();
		countdown c = new countdown();

		// COMPUTATION
		c.start_time();
		for (int i = 1; i <= n; i++)
			sum = sum + i;
		time = c.elapsed_time();
		System.out.print("Total time elapsed during computation: " + time);
	}
}