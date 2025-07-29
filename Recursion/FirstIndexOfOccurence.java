package Recursion;

import java.util.*;
public class FirstIndexOfOccurence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();

        int first = FirstIndex(arr,0, d);
        System.out.println(first);
    }

    public static int FirstIndex(int[] arr, int idx, int x){
        if (idx == arr.length){
            return -1;

        }

//        int fiisa = FirstIndex(arr,idx+1,x);
//        if(arr[idx] == x){
//            return idx;
//
//        }
//        else {
//            return fiisa;
//        }

        if(arr[idx] == x){
            return idx;
        }
        else{
            int firstinsmallarray = FirstIndex(arr, idx+1,x);
            return firstinsmallarray;
        }


    }
}
