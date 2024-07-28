import java.util.Scanner;
public class SumOfNOddNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Sum of first " + n + " odd numbers: " + sumOfNOddNumbers(n));
    }

    public static int sumOfNOddNumbers(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 2 * i + 1;
        }
        return sum;
    }
}
