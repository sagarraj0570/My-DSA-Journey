package StringAndArrayList;

import java.util.*;

public class IntroArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + "->" + list.size());

        //add
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list + "->" + list.size());

        list.add(1,1000);
        System.out.println(list + "->" + list.size());

        int val = list.get(1);
        System.out.println(val);

        list.set(2,2000);
        System.out.println(list + "->" + list.size());

        list.remove(1);
        System.out.println(list + "->" + list.size());

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("hell");
        l2.add("bell");
        l2.add("cell");
        System.out.println(l2 + "->" + list.size());

//        for(int i=0;i<list.size();i++){  //printing content of AL
//            int val1 = list.get(i);
//            System.out.println(val1);
//        }
//        for(int val1: list){
//            System.out.println(val1);
//        }






    }
}
