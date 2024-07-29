import java.util.ArrayList;
import java.util.List;

public class ReturnTwoPrimes {
    public static boolean[] sieveOfEratosthenes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }
    public static int[] primeDivision(int n) {
        boolean[] isPrime = sieveOfEratosthenes(n);
        int[] result = new int[2];
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime[i] && isPrime[n - i]) {
                result[0] = i;
                result[1] = n - i;
                break;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int n1 = 74;
        int n2 = 4;

        int[] result1 = primeDivision(n1);
        int[] result2 = primeDivision(n2);
         System.out.println("For n = " + n1 + ", the prime pair is: " + result1[0] + " " + result1[1]);
        System.out.println("For n = " + n2 + ", the prime pair is: " + result2[0] + " " + result2[1]);
    }
}

