package ArraysFile;

import java.util.*;
public class MatrixMulti {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int c1 = sc.nextInt();


        int[][] arr1 = new int[r1][c1];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = sc.nextInt();

            }
        }
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] arr2 = new int[r2][c2];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = sc.nextInt();
            }

        }
        if(c1!=r2){
            System.out.println("Invalid input");
            return;
        }

        int[][] prd = new int[r1][c2];

        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                for(int k=0;k<c1;k++){
                    prd[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        for (int i=0;i<prd.length;i++){
            for (int j=0;j<prd[0].length;j++){
                System.out.print(prd[i][j]+" ");


            }
            System.out.println();
        }
    }
}
