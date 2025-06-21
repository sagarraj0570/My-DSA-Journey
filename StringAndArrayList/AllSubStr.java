package StringAndArrayList;

import java.util.*;
public class AllSubStr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);

        System.out.println(s.substring(0,3));

        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }

        String s1 ="hello";  //addition of two string
        String s2 = "world";
        String s3 = s1+" "+s2;
        System.out.println(s3);


        //use of split function
        String s4 = "abc,def,ghi,jkl mno";
        String[] parts = s4.split(","); // split using comma or can be used with space too
        for(int i=0;i< parts.length;i++){
            System.out.println(parts[i]);
        }








    }
}
