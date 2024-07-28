import java.util.*;
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Prime factorization of " + num + ":");
        primeFactorization(num);
    }

    public static void primeFactorization(int num) {
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
    }
}