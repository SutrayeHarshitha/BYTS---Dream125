/*The happy number can be defined as a number which will yield 1 when it is replaced by the sum of the square of its digits repeatedly. 
If this process results in an endless cycle of numbers containing 4, then the number is called an unhappy number.*/

/*sum of result is 1 ,then it is happy number */
import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        while (num != 1 && num != 4) {
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }
            num = sum;
        }
        if (num == 1) {
            System.out.println("Happy number");
        } else {
            System.out.println("Not a happy number");
        }
    }
}
