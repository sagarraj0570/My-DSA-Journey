package StringAndArrayList;

import java.util.Scanner;
public class printAllChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            System.out.println(ch);
        }

        //can't change the content of string like s.charAt(0) = 'z'; it won't change the value





    }
}
