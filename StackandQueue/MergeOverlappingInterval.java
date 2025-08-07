package StackandQueue;

import java.util.*;

public class MergeOverlappingInterval {

    /**
     * Merge Overlapping Intervals
     *
     * TIME COMPLEXITY:
     * - Sorting: O(n log n)
     * - Merging: O(n)
     * => Overall: O(n log n)
     *
     * SPACE COMPLEXITY:
     * - O(n) for storing merged intervals in the list
     * - O(1) extra space if we don't count the output list
     */

    public static List<int[]> mergeInterval(int[][] intervals) {
        List<int[]> merged = new ArrayList<>(); // Stores final merged intervals

        // STEP 1: Edge case — if 0 or 1 interval, no merging needed
        if (intervals.length <= 1) {
            return Arrays.asList(intervals);
        }

        // STEP 2: Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // STEP 3: Traverse through intervals
        for (int[] interval : intervals) {

            // CASE 1: First interval OR no overlap with last merged interval
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval); // Add directly
            }
            // CASE 2: Overlap exists — merge with last interval
            else {
                // Update the end of the last interval in merged list
                merged.get(merged.size() - 1)[1] =
                        Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        return merged; // Return merged list
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Step A: Take number of intervals
        int n = sc.nextInt();

        // Step B: Create 2D array to store intervals
        int[][] intervals = new int[n][2];

        // Step C: Input intervals
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt(); // start time
            intervals[i][1] = sc.nextInt(); // end time
        }

        // Step D: Call merge function
        List<int[]> merged = mergeInterval(intervals);

        // Step E: Output merged intervals
        for (int[] interval : merged) {
            System.out.println(interval[0] + " " + interval[1]);
        }

        sc.close();
    }
}

/**
 * DRY RUN EXAMPLE:
 * Input: [[1,3], [2,6], [8,10], [15,18]]
 *
 * After sorting: [[1,3], [2,6], [8,10], [15,18]]
 *
 * Step 1: merged = []
 * Step 2: Add [1,3] -> merged = [[1,3]]
 * Step 3: [2,6] overlaps with [1,3] => merge -> [1,6] -> merged = [[1,6]]
 * Step 4: [8,10] does not overlap -> merged = [[1,6],[8,10]]
 * Step 5: [15,18] does not overlap -> merged = [[1,6],[8,10],[15,18]]
 *
 * Output: [[1,6],[8,10],[15,18]]
 */
