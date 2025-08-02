package StackandQueue;

import java.util.*;
import java.io.*;

public class NextGreatORight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking array size input
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Taking array elements input
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Stack to store potential next greater elements
        Stack<Integer> st = new Stack<>();

        // Output array to store answers
        int[] ans = new int[n];

        // Traverse the array from right to left
        for(int i = n - 1; i >= 0; i--) {
            // Pop all elements from stack that are <= current element
            // Because they can’t be the next greater element
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // If stack is empty, no greater element to the right
            if(st.isEmpty()) {
                ans[i] = -1;
            } else {
                // Top of the stack is the next greater element
                ans[i] = st.peek();
            }

            // Push current element to stack (it might be NGE for left elements)
            st.push(arr[i]);
        }

        // Print the result using for-each loop
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}

/*
----------------------------------------------------------
Time Complexity: O(n)
- Each element is pushed and popped at most once from the stack.

Space Complexity: O(n)
- Stack can hold up to n elements in worst case (e.g., decreasing array)
- ans[] output array also takes O(n) space

n = size of the input array
----------------------------------------------------------
*/
