package StackandQueue;

import java.util.*;

public class DuplicateBrackets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == ')'){
                if (st.peek() == '('){
                    System.out.println(true);
                    return;
                }
                else {
                    while (st.peek() != '('){
                        st.pop();
                    }
                    st.pop(); // to pop out the remaining '(' in Stack

                }


            }
            else {
                st.push(ch);

            }
        }
        System.out.println(false);

    }
}
