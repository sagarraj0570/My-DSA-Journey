package Recursion;

import java.util.*;

//string length - n
// total subsequence - 2^n , total pairs - 2^(n-1), total characters - 2^(n-1) * n
public class PrintSubSequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printSS(str, " ");

    }

    public static void printSS(String ques, String ans){

        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        printSS(roq, ans + "");
        printSS(roq, ans + ch);


    }



}
