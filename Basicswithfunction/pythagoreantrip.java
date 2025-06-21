import java.util.*;

public class pythagoreantrip {
    public static boolean triplets(int a, int b, int c) {
        return (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (triplets(a, b, c)) {
            System.out.println("Pythagorean triplet");
        } else {
            System.out.println("Not Pythagorean triplet");
        }
    }
}
