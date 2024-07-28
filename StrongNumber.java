/* A strong number is a number whose sum of the factorial of its digits is equal to the original number. */

import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int sum = 0;
        int originalNum = num;
        while (num != 0) {
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            num /= 10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is a strong number");
        } else {
            System.out.println(originalNum + " is not a strong number");
        }
    }
}



       