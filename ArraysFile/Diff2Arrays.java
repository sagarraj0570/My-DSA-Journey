package ArraysFile;

import java.util.*;

public class Diff2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first number
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second number
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        // Determine greater and smaller
        boolean arr1IsSmaller = isSmaller(arr1, arr2);

        int[] bigger = arr1IsSmaller ? arr2 : arr1;
        int[] smaller = arr1IsSmaller ? arr1 : arr2;

        // Perform subtraction: bigger - smaller
        int[] diff = new int[bigger.length];
        int borrow = 0;

        int i = smaller.length - 1;
        int j = bigger.length - 1;
        int k = diff.length - 1;

        while (k >= 0) {
            int a = (i >= 0) ? smaller[i] : 0;
            int b = bigger[j] + borrow;
            int d;

            if (b >= a) {
                d = b - a;
                borrow = 0;
            } else {
                d = b + 10 - a;
                borrow = -1;
            }

            diff[k] = d;
            i--;
            j--;
            k--;
        }

        // Skip leading zeros
        int idx = 0;
        while (idx < diff.length && diff[idx] == 0) {
            idx++;
        }

        // Print result
        if (idx == diff.length) {
            System.out.println(0); // All zeros
        } else {
            while (idx < diff.length) {
                System.out.print(diff[idx]);
                idx++;
            }
            System.out.println();
        }

        sc.close();
    }

    // Compare two arrays as numbers: return true if a < b
    static boolean isSmaller(int[] a, int[] b) {
        if (a.length != b.length)
            return a.length < b.length;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return a[i] < b[i];
        }
        return false;
    }
}
