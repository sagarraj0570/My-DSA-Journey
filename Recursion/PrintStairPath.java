package Recursion;

import java.util.*;

public class PrintStairPath {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PSP(n, "");

    }

    public static void PSP(int n, String path){
        if(n<0){
            return;
        }
        if(n==0){
            System.out.println(path);

        }
        PSP(n-1, path + "1");
        PSP(n-2, path + "2");
        PSP(n-3, path + "3");


    }


}
