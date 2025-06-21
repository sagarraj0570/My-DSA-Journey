package Recursion;

import java.util.*;

public class PrintIncreasing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintIncreasing(n);


    }

    public static void PrintIncreasing(int n){
        if(n==0){
            return;
        }

        PrintIncreasing(n-1);
        System.out.println(n);





    }
}
