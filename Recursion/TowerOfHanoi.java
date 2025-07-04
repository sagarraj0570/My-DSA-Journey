package Recursion;

import java.util.*;
public class TowerOfHanoi {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1id = sc.nextInt();//source
        int t2id = sc.nextInt();//helper
        int t3id = sc.nextInt();//dest
        toh(n, t1id, t2id, t3id);


    }

    public static void toh(int n , int t1id, int t2id, int t3id){
        if (n == 0){
            return;
        }

        toh(n-1, t1id, t3id, t2id);

        System.out.println(n + "[" + t1id + "->" + t2id + "]");

        toh(n-1, t3id,t2id, t1id);

    }
}
