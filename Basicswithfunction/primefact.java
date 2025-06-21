import java.util.Scanner;

public class primefact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;

        while (i * i <= n) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
            i++;
        }

        if (n > 1) {
            System.out.println(n); // remaining prime factor
        }
    }
}
