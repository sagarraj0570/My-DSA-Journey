package ArraysFile;
// Time Complexity: O(n²)

import java.util.*;

public class SaddlePoint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Read the size of the square matrix
        int n = sc.nextInt();

        // Declare and initialize a 2D array (n x n matrix)
        int[][] arr = new int[n][n];

        // Read matrix elements from user input
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Loop through each row to find the saddle point
        for(int i = 0; i < arr.length; i++){

            // Find the index of the smallest element in the current row
            int svj = 0; // svj = smallest value's column index
            for(int j = 1; j < arr[0].length; j++){
                if(arr[i][j] < arr[i][svj]){
                    svj = j; // Update index if a smaller element is found
                }
            }

            // Check if the found element is also the largest in its column
            boolean flag = true;
            for(int k = 0; k < arr.length; k++){
                if(arr[k][svj] > arr[i][svj]){
                    // If any element in the column is greater, it's not a saddle point
                    flag = false;
                    break;
                }
            }

            // If the element is the minimum in its row and maximum in its column
            if (flag == true){
                System.out.println(arr[i][svj]); // Print saddle point
                return; // Exit after finding the first saddle point
            }
        }

        // If no saddle point is found after checking all rows
        System.out.println("Invalid Input");

        sc.close(); // Close the scanner to free resources
    }
}
