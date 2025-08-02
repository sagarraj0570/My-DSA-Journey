package StackandQueue;

import java.io.*;
import java.util.*;

public class StockSpan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input: number of days
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input: stock prices for each day
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Stack to store indices of previous days
        Stack<Integer> st = new Stack<>();

        // Array to store span for each day
        int[] ans = new int[n];

        // Traverse from left to right (day 0 to day n-1)
        for (int i = 0; i <= n - 1; i++) {

            // Pop all previous days with price <= current day's price
            // They can't be part of the span anymore
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            // If stack is empty → no previous greater → span = i + 1
            if (st.isEmpty()) {
                ans[i] = i + 1;
            }
            // Else → last higher price was at st.peek() → span = i - st.peek()
            else {
                ans[i] = i - st.peek();
            }

            // Push current index onto the stack (might help next days)
            st.push(i);
        }

        // Output: print the span for each day
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}

/*
----------------------------------------------------------
Time Complexity: O(n)
- Each index is pushed and popped from the stack at most once.
- The loop runs in linear time.

Space Complexity: O(n)
- Stack holds indices → O(n) in worst case (strictly increasing prices).
- ans[] array also takes O(n) space.

n = number of days
----------------------------------------------------------
*/
