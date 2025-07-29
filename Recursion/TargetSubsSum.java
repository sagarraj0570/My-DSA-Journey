package Recursion;

import java.util.*;

public class TargetSubsSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        TargetSum(arr,0,"",0,tar);
        //sos = sum of set

    }
    public static void TargetSum(int[] arr, int idx, String set,int sos, int tar){
        if(idx == arr.length){
            if (sos == tar){
                System.out.println(set + ".");
            }
            return;
        }
        TargetSum(arr,idx+1,set + arr[idx] + ",",sos + arr[idx],tar);
        TargetSum(arr,idx + 1,set,sos,tar);




    }
}
