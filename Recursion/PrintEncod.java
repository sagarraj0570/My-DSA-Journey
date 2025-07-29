package Recursion;

import java.util.*;

public class PrintEncod {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printEncodings(str, "");
    }

    public static void printEncodings(String ques, String asf) {
        if (ques.length() == 0) {
            System.out.println(asf);
            return;
        }

        // Single digit encoding
        char ch1 = ques.charAt(0);
        if (ch1 == '0') {
            return;  // '0' has no valid mapping
        }

        int chv1 = ch1 - '0';
        char code1 = (char)('a' + chv1 - 1);
        printEncodings(ques.substring(1), asf + code1);

        // Double digit encoding (only if length >= 2)
        if (ques.length() >= 2) {
            String ch12 = ques.substring(0, 2);
            int chv2 = Integer.parseInt(ch12);

            if (chv2 <= 26) {
                char code2 = (char)('a' + chv2 - 1);
                printEncodings(ques.substring(2), asf + code2);
            }
        }
    }
}
