package StackandQueue;

import java.util.*;

public class LargestAreaHistogram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] height = new int[n];

        // Input the heights of the histogram bars
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        int[] NSL = new int[n]; // Nearest Smaller to Left indices

        // Step 1: Compute NSL (Nearest Smaller to Left)
        for (int i = 0; i < n; i++) {
            // Pop all bars from stack that are taller or equal
            while (!st.isEmpty() && height[st.peek()] >= height[i]) {
                st.pop();
            }

            // If no smaller element on left
            if (st.isEmpty()) {
                NSL[i] = -1;
            } else {
                NSL[i] = st.peek();
            }

            // Push current index to stack
            st.push(i);
        }

        st.clear(); // Reset the stack for next use
        int[] NSR = new int[n]; // Nearest Smaller to Right indices

        // Step 2: Compute NSR (Nearest Smaller to Right)
        for (int i = n - 1; i >= 0; i--) {
            // Pop all bars from stack that are taller or equal
            while (!st.isEmpty() && height[st.peek()] >= height[i]) {
                st.pop();
            }

            // If no smaller element on right
            if (st.isEmpty()) {
                NSR[i] = n;
            } else {
                NSR[i] = st.peek();
            }

            // Push current index to stack
            st.push(i);
        }

        int maxArea = 0;

        // Step 3: Calculate max area for each bar
        for (int i = 0; i < n; i++) {
            int width = NSR[i] - NSL[i] - 1;
            int area = height[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        System.out.println(maxArea); // Output the largest rectangle area

        /*
         * ✅ Time Complexity: O(n)
         *  - Each element is pushed and popped at most once in NSL/NSR
         *  - Area calculation is O(n)
         *
         * ✅ Space Complexity: O(n)
         *  - Stack space: O(n)
         *  - Arrays NSL, NSR: O(n)
         */
    }
}
