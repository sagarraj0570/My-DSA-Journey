package StackandQueue;

import java.util.*;
import java.io.*;

public class BalancedBracket {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else if(ch == ']'){
                if(st.isEmpty() == true || st.peek() != '['){
                    System.out.println(false);
                    return;
                }
                st.pop();

            }
            else if (ch == ')'){
                if(st.isEmpty() == true || st.peek() != '('){
                    System.out.println(false);
                    return;
                }
                st.pop();

            }
            else if(ch == '}'){
                if(st.isEmpty() == true || st.peek() != '{'){
                    System.out.println(false);
                    return;
                }
                st.pop();
            }
        }

        if(st.size() > 0){
            System.out.println(false);
            return;
        }

        System.out.println(true);



    }
}
