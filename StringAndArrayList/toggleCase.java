package StringAndArrayList;
import java.util.*;

public class toggleCase {
    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder(str);

        for (int i=0;i < sb.length();i++){
            char ch = sb.charAt(i);

            if (ch>='a' && ch<='z'){
                char uc = (char) ('A'+ ch - 'a');
                sb.setCharAt(i,uc);

            }
            else if (ch>='A' && ch<='Z'){
                char lc = (char) ('a'+ ch - 'A');
                sb.setCharAt(i,lc);
            }

        }
        return sb.toString();

    }




    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            String n = sc.nextLine();
//            int l = n.length();
//            char x;
//            String m = "";
//            for (int i = 0; i < l; i++) {
//                x = n.charAt(i);
//                if (x >= 65 && x <= 90)
//                    m = m + (Character.toLowerCase(x));
//                else if (x >= 97 && x <= 122)
//                    m = m + (Character.toUpperCase(x));
//                else m = m + x;
//
//            }
//            System.out.println(m);

        //lc = 'a'+ uc - 'A' uc=uppercase
        //uc = 'A'+ lc - 'a' lc = lowercase
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(toggleCase(str));


    }

    }

