package Recursion;

import java.util.*;

public class PowerLogarithmic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // Input base
        int n = sc.nextInt(); // Input exponent

        int pow = Power(x, n); // Calculate x raised to power n
        System.out.println(pow); // Output the result
    }

    /**
     * Recursively computes x raised to the power n using divide and conquer.
     *
     * Time Complexity: O(log n)
     *    - At each recursive step, we divide the exponent 'n' by 2.
     *    - So, the number of recursive calls is proportional to log₂(n).
     *
     * Space Complexity: O(log n)
     *    - Due to recursive function calls stored on the call stack.
     *    - Stack depth is also log₂(n), one for each call.
     *
     * @param x the base
     * @param n the exponent
     * @return x raised to the power n (x^n)
     */
    public static int Power(int x, int n){
        // Base case: x^0 = 1
        if (n == 0){
            return 1;
        }

        // Recursive call: Compute x^(n/2)
        int xn2 = Power(x, n / 2);

        // If n is even: x^n = (x^(n/2))^2
        if (n % 2 == 0){
            return xn2 * xn2;
        }
        // If n is odd: x^n = x * (x^(n/2))^2
        else{
            return x * xn2 * xn2;
        }
    }
}
