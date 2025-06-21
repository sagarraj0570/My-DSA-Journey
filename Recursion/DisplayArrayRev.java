package Recursion;

import java.util.*;
public class DisplayArrayRev {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        displayArrRev(arr, n-1);
    }

    public static void displayArrRev(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }

        System.out.println(arr[idx]);

        displayArrRev(arr , idx-1);


    }
}
