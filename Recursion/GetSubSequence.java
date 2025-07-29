package Recursion;

import java.io.*;
import java.util.*;


public class GetSubSequence {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res = GSS(str);
        System.out.println(res);

    }

    public static ArrayList<String> GSS(String str){

        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;

        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = GSS(ros);

        ArrayList<String> mres = new ArrayList<>();
        for(String rstr: rres){
            mres.add(""+rstr);


        }
        for(String rstr: rres) {
            mres.add(ch + rstr);
        }
        return mres;

        

    }


}
