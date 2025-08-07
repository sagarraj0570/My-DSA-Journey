package StackandQueue;

import java.io.*;
import java.util.*;

public class CelebrityProb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // ---------------------- TIME & SPACE ----------------------
        // Time Complexity: O(n) — due to pairwise elimination (n - 1 comparisons) and final O(n) verification
        // Space Complexity: O(n) — for the stack used to hold candidates

        int n = sc.nextInt(); // Number of people in the party

        // celeb[i][j] = 1 means person i knows person j
        int[][] celeb = new int[n][n];

        // Taking input of the matrix
        for(int i = 0; i < celeb.length; i++){
            for(int j = 0; j < celeb[0].length; j++){
                celeb[i][j] = sc.nextInt();
            }
        }

        Stack<Integer> cand = new Stack<>();

        // Step 1: Push all people (0 to n-1) into the stack as potential candidates
        for(int i = 0; i < n; i++){
            cand.push(i);
        }

        // Step 2: Eliminate non-celebrities using pairwise comparisons
        while (cand.size() > 1){
            int a = cand.pop(); // pick one person
            int b = cand.pop(); // pick another person

            if(celeb[a][b] == 1){
                // a knows b → a is not a celebrity
                cand.push(b);
            }
            else {
                // a does not know b → b is not a celebrity
                cand.push(a);
            }
        }

        // Step 3: Only one candidate remains, potential celebrity
        int pot = cand.pop();

        // Step 4: Verify the candidate
        for(int i = 0; i < n; i++){
            if(i != pot){
                // Conditions to be a celebrity:
                // 1. pot should not know anyone (celeb[pot][i] == 0)
                // 2. everyone should know pot (celeb[i][pot] == 1)
                if(celeb[pot][i] == 1 || celeb[i][pot] == 0){
                    System.out.println("-1"); // Candidate fails → no celebrity
                    return;
                }
            }
        }

        // Step 5: Candidate passed all checks → confirmed celebrity
        System.out.println(pot);
    }
}
