

import java.util.Scanner;

public class SmithNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(isSmithNumber(num) ? num + " is a Smith number" : num + " is not a Smith number");
    }

    public static boolean isSmithNumber(int num) {
        int sum = sumOfDigits(num);
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                sum -= sumOfDigits(i);
                num /= i;
                i--;
            }
        }
        return sum == 0;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
