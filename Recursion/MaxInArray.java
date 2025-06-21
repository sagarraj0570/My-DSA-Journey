package Recursion;

import java.util.*;
public class MaxInArray {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int max =MaxElement(arr , 0);
        System.out.println(max);

    }

    public static int MaxElement(int arr[], int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }

        int a1=MaxElement(arr, idx+1);
        if(a1>arr[idx]){
            return a1;
        }
        else {
            return arr[idx];
        }

    }
}
