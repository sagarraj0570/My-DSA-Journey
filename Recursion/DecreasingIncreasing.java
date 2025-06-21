package Recursion;

import java.util.*;

public class DecreasingIncreasing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DecreasingIncreasing(n);


    }
    public static void DecreasingIncreasing(int n){

        if(n==0){
            return;
        }
        System.out.println(n);
        DecreasingIncreasing(n-1);
        System.out.println(n);

    }


    }
