package Recursion;

import java.util.*;

public class LastIndexOfOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int li = LastIndex(arr, 0, x);
        System.out.println(li);
    }

    public static int LastIndex(int[] arr, int idx, int x){

        if(idx == arr.length){
            return -1;
        }

        int liissa = LastIndex(arr, idx+1 , x);

        if(liissa == -1){
            if(arr[idx] == x){
                return idx;

            }
            else {
                return -1;
            }
        }
        else {
            return liissa;
        }
    }
}
