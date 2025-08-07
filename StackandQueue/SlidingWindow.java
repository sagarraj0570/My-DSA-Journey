package StackandQueue;

import java.io.*;
import java.util.*;

// | Action                           | Code                |
// |----------------------------------|---------------------|
// | Add to back                      | dq.addLast(i);      |
// | Remove from back                 | dq.removeLast();    |
// | Add to front                     | dq.addFirst(i);     |
// | Remove from front                | dq.removeFirst();   |
// | Get front index (without remove) | dq.peekFirst();     |
// | Get back index (without remove)  | dq.peekLast();      |
// | Check if empty                   | dq.isEmpty();       |

public class SlidingWindow {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Size of array
        int m = sc.nextInt(); // Window size (k)

        int[] sw = new int[n];
        for (int i = 0; i < sw.length; i++) {
            sw[i] = sc.nextInt(); // Input elements
        }

        Deque<Integer> dq = new ArrayDeque<>(); // Stores indices of potential maximums
        List<Integer> res = new ArrayList<>();  // Stores maximum of each sliding window

        for (int i = 0; i < n; i++) {
            // Step 1: Remove indices from front if they’re out of the current window
            if (!dq.isEmpty() && dq.peekFirst() <= i - m) {
                dq.removeFirst();
            }

            // Step 2: Maintain decreasing order in deque
            // Remove indices from back whose values are <= current value
            while (!dq.isEmpty() && sw[dq.peekLast()] <= sw[i]) {
                dq.removeLast();
            }

            // Step 3: Add current index to deque
            dq.addLast(i);

            // Step 4: Record the max of current window
            // Start recording once we’ve reached the first full window
            if (i >= m - 1) {
                res.add(sw[dq.peekFirst()]);
            }
        }

        // Step 5: Output all max values from the result list
        for (int val : res) {
            System.out.print(val + " ");
        }

        /*
         *  Time Complexity: O(n)
         *   - Each element is added and removed from deque at most once
         *
         *  Space Complexity: O(k)
         *   - Deque holds at most k elements at any time
         *   - Result list takes O(n - k + 1) space for storing max values
         */
    }
}
